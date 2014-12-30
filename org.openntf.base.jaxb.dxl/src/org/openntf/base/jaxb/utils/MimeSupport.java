package org.openntf.base.jaxb.utils;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.stream.EntityState;
import org.apache.james.mime4j.stream.Field;
import org.apache.james.mime4j.stream.MimeTokenStream;
import org.openntf.base.jaxb.dxl.Document;
import org.openntf.base.jaxb.dxl.Item;
import org.openntf.base.mime.MimeContainer;

import com.ibm.commons.util.StringUtil;
import com.ibm.commons.util.io.base64.Base64;

public enum MimeSupport {
	INSTANCE;

	public String getMimeStringFromDocument(Document docConverted, String fieldName) {
		if (docConverted == null) {
			throw new NullPointerException("Document can not be null");
		}
		if (StringUtil.isEmpty(fieldName)) {
			throw new IllegalArgumentException("fieldName can not be empty");
		}
		StringBuilder sb = new StringBuilder();
		for (Item itemScan : docConverted.getItem()) {
			if (fieldName.equalsIgnoreCase(itemScan.getName())) {
				processField(itemScan, sb);
			}
		}
		return sb.toString();
	}

	private void processField(Item itemScan, StringBuilder sb) {
		if (itemScan.getRawitemdata() != null) {
			sb.append(Base64.decode(itemScan.getRawitemdata().getValue()).substring(20));
		}
	}

	public String getHTMLFromMimeString(String mimeValue) throws IOException, MimeException {
		MimeTokenStream stream = new MimeTokenStream();
		stream.parse(new ByteArrayInputStream(mimeValue.getBytes("UTF-8")));
		for (EntityState state = stream.getState(); state != EntityState.T_END_OF_STREAM; state = stream.next()) {
			switch (state) {
			case T_BODY:
				System.out.println("Body detected, contents = " + stream.getInputStream() + ", header data = " + stream.getBodyDescriptor());
				break;
			case T_FIELD:
				System.out.println("Header field detected: " + stream.getField());
				break;
			case T_START_MULTIPART:
				System.out.println("Multipart message detexted," + " header data = " + stream.getBodyDescriptor());
			}
		}
		return null;
	}

	public MimeContainer getMimeContainer(String mimeValue) throws IOException, MimeException {
		MimeContainer container = null;
		MimeTokenStream stream = new MimeTokenStream();
		stream.parse(new ByteArrayInputStream(mimeValue.getBytes("UTF-8")));
		Map<String, String> headers = new WeakHashMap<String, String>();
		for (EntityState state = stream.getState(); state != EntityState.T_END_OF_STREAM; state = stream.next()) {
			switch (state) {
			case T_BODY:
				headers = new WeakHashMap<String, String>();
				if ("text/html".equals(stream.getBodyDescriptor().getMimeType())) {
					container = MimeContainer.buildWithBodyStream(stream.getReader());
				} else {
					container.addMimeElement(headers, stream.getDecodedInputStream());
				}
				break;
			case T_FIELD:
				Field field = stream.getField();
				headers.put(field.getName(), field.getBody());
				break;
			case T_START_MULTIPART:
				headers = new WeakHashMap<String, String>();
			}
		}
		return container;
	}

}
