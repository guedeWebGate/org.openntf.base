package org.openntf.base.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.james.mime4j.stream.BodyDescriptor;

public class MimeElement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String m_Content;
	private final Map<String, String> m_Headers = new HashMap<String, String>();
	private final String m_MediaType;
	private final String m_MimeType;
	private byte[] m_BinaryData;

	public static MimeElement buildElement(Map<String, String> headers, InputStream decodedInputStream, BodyDescriptor bodyDescriptor) throws IOException {
		String content = IOUtils.toString(decodedInputStream);

		return new MimeElement(content, headers, bodyDescriptor.getMediaType(), bodyDescriptor.getMimeType());
	}

	private MimeElement(String content, Map<String, String> headers, String media, String mime) {
		m_Content = content;
		m_Headers.putAll(headers);
		m_MediaType = media;
		m_MimeType = mime;
	}

	public String getContent() {
		return m_Content;
	}

	public Map<String, String> getHeaders() {
		return m_Headers;
	}

	public String getMediaType() {
		return m_MediaType;
	}

	public String getMimeType() {
		return m_MimeType;
	}

	@Override
	public String toString() {
		return "[mediaType]= " + m_MediaType + " [mimeType]= " + m_MimeType + " [Header]= " + m_Headers + " [content]= " + m_Content + "\n";
	}

	public byte[] getBinaryData() {
		return m_BinaryData;
	}

	public void setBinaryData(byte[] filedata) {
		m_BinaryData = filedata;
	}

}
