package org.openntf.base.jaxb.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.stream.EntityState;
import org.apache.james.mime4j.stream.Field;
import org.apache.james.mime4j.stream.MimeTokenStream;
import org.cyberneko.html.parsers.DOMParser;
import org.openntf.base.jaxb.dxl.Document;
import org.openntf.base.jaxb.dxl.Item;
import org.openntf.base.mime.MimeContainer;
import org.openntf.base.mime.MimeElement;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

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

	@SuppressWarnings("incomplete-switch")
	public MimeContainer getMimeContainer(String mimeValue) throws IOException, MimeException, SAXException {
		MimeContainer container = findHTMLContent(mimeValue);
		if (container == null) {
			throw new NullPointerException("No text/html part found");
		}
		MimeTokenStream stream = new MimeTokenStream();
		stream.parse(new ByteArrayInputStream(mimeValue.getBytes("UTF-8")));
		Map<String, String> headers = new WeakHashMap<String, String>();
		for (EntityState state = stream.getState(); state != EntityState.T_END_OF_STREAM; state = stream.next()) {
			switch (state) {
			case T_BODY:
				if ("text/html".equals(stream.getBodyDescriptor().getMimeType())) {
				} else {
					container.addMimeElement(headers, stream.getDecodedInputStream(), stream.getBodyDescriptor());
				}
				headers = new WeakHashMap<String, String>();
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

	@SuppressWarnings("incomplete-switch")
	private MimeContainer findHTMLContent(String mimeValue) throws IOException, MimeException, SAXException {
		MimeTokenStream stream = new MimeTokenStream();
		stream.parse(new ByteArrayInputStream(mimeValue.getBytes("UTF-8")));
		for (EntityState state = stream.getState(); state != EntityState.T_END_OF_STREAM; state = stream.next()) {
			switch (state) {
			case T_BODY:
				if ("text/html".equals(stream.getBodyDescriptor().getMimeType())) {
					MimeContainer container = MimeContainer.buildWithBodyStream(stream.getReader());
					DOMParser parser = new DOMParser();
					InputSource is = new InputSource(new StringReader(container.getHTMLBody()));
					parser.parse(is);
					container.setHTMLDOM(parser.getDocument());
					return container;
				}
				break;
			}
		}
		return null;
	}

	public void checkElementsForMissingData(List<MimeElement> mimeElements, Document docConverted) {
		for (MimeElement element : mimeElements) {
			if (element.getHeaders().containsKey("Content-Transfer-Encoding") && "binary".equals(element.getHeaders().get("Content-Transfer-Encoding"))) {
				for (Item item : docConverted.getItem()) {
					if ("$File".equalsIgnoreCase(item.getName()) && item.getObject() != null && item.getObject().getFile() != null
							&& item.getObject().getFile().getName().equalsIgnoreCase(element.getContent())) {
						element.setBinaryData(item.getObject().getFile().getFiledata());
					}
				}
			}
		}

	}
}
