package org.openntf.base.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

public class MimeContainer {
	private final String m_HTMLBody;
	private final List<MimeElement> m_MimeElements = new LinkedList<MimeElement>();

	private MimeContainer(String body) {
		m_HTMLBody = body;
	}

	public Object getHTMLBody() {
		return m_HTMLBody;
	}

	public static MimeContainer buildWithBodyStream(Reader reader) throws IOException {
		String html = IOUtils.toString(reader);
		reader.close();
		return new MimeContainer(html);
	}

	public void addMimeElement(Map<String, String> headers, InputStream decodedInputStream) throws IOException {
		m_MimeElements.add(MimeElement.buildElement(headers, decodedInputStream));
	}

	public List<MimeElement> getMimeElements() {
		return m_MimeElements;
	}

}
