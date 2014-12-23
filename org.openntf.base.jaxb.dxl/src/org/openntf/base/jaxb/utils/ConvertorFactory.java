package org.openntf.base.jaxb.utils;

import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.openntf.base.jaxb.dxl.Document;

public class ConvertorFactory {

	public static Document convert2DXLDocumentFromStream(final InputStream isXML) {
		Document dxlDocument = AccessController.doPrivileged(new PrivilegedAction<Document>() {

			@Override
			public Document run() {
				JAXBContext context;
				try {
					context = JAXBContext.newInstance(Document.class);
					Unmarshaller unmarshaler = context.createUnmarshaller();
					StreamSource source = new StreamSource(isXML);
					JAXBElement<Document> root = unmarshaler.unmarshal(source, Document.class);
					return root.getValue();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
		});
		return dxlDocument;
	}

}
