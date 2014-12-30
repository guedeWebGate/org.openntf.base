package org.openntf.base.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;

public class MimeElement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String m_Content;
	private final Map<String, String> m_Headers = new HashMap<String, String>();

	public static MimeElement buildElement(Map<String, String> headers, InputStream decodedInputStream) throws IOException {
		String content = IOUtils.toString(decodedInputStream);
		return new MimeElement(content, headers);
	}

	private MimeElement(String content, Map<String, String> headers) {
		m_Content = content;
		m_Headers.putAll(headers);
	}

	public String getContent() {
		return m_Content;
	}

	public Map<String, String> getHeaders() {
		return m_Headers;
	}

}
