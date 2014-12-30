package org.openntf.base.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.james.mime4j.stream.BodyDescriptor;
import org.w3c.dom.Document;

public class MimeContainer {
	private final String m_HTMLBody;
	private final List<MimeElement> m_MimeElements = new LinkedList<MimeElement>();
	private Document m_HTMLDom;
	private MimeContainer(String body) {
		m_HTMLBody = body;
	}

	public String getHTMLBody() {
		return m_HTMLBody;
	}

	public static MimeContainer buildWithBodyStream(Reader reader) throws IOException {
		String html = IOUtils.toString(reader);
		reader.close();
		return new MimeContainer(html);
	}

	public void addMimeElement(Map<String, String> headers, InputStream decodedInputStream, BodyDescriptor bodyDescriptor) throws IOException {
		m_MimeElements.add(MimeElement.buildElement(headers, decodedInputStream, bodyDescriptor));
	}

	public List<MimeElement> getMimeElements() {
		return m_MimeElements;
	}

	public Document getHTMLDOM() {
		return m_HTMLDom;
	}

	public void setHTMLDOM(org.w3c.dom.Document document) {
		m_HTMLDom = document;
	}

}
