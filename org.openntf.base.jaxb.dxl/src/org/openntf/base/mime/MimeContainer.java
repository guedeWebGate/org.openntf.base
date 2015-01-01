package org.openntf.base.mime;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.james.mime4j.stream.BodyDescriptor;
import org.w3c.dom.Document;

public class MimeContainer {
	private final String m_HTMLBody;
	private final List<MimeElement> m_MimeElements = new LinkedList<MimeElement>();
	private final Document m_HTMLDom;

	public static MimeContainer buildWithBodyAndDom(String html, Document dom) throws IOException {
		return new MimeContainer(html, dom);
	}

	private MimeContainer(String body, Document dom) {
		m_HTMLBody = body;
		m_HTMLDom = dom;
	}

	public String getHTMLBody() {
		return m_HTMLBody;
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
}
