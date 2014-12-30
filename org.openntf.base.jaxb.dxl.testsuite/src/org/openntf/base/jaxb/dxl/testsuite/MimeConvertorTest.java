package org.openntf.base.jaxb.dxl.testsuite;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.InputStream;

import org.apache.james.mime4j.MimeException;
import org.junit.Test;
import org.openntf.base.jaxb.dxl.Document;
import org.openntf.base.jaxb.utils.ConvertorFactory;
import org.openntf.base.jaxb.utils.MimeSupport;
import org.openntf.base.mime.MimeContainer;

public class MimeConvertorTest {

	@Test
	public void extractMimeAsString() {
		InputStream isXML = ConverterFactoryTest.class.getResourceAsStream("dxl-document-test-nosys.xml");
		Document docConverted = ConvertorFactory.convert2DXLDocumentFromStream(isXML);
		assertNotNull(docConverted);
		String mimeValue = MimeSupport.INSTANCE.getMimeStringFromDocument(docConverted, "bodyXPages");
		assertNotNull(mimeValue);
	}
	
	@Test
	public void buildMimeMultiPart() throws IOException, MimeException {
		InputStream isXML = ConverterFactoryTest.class.getResourceAsStream("dxl-document-test-nosys.xml");
		Document docConverted = ConvertorFactory.convert2DXLDocumentFromStream(isXML);
		assertNotNull(docConverted);
		String mimeValue = MimeSupport.INSTANCE.getMimeStringFromDocument(docConverted, "bodyXPages");
		MimeContainer container =MimeSupport.INSTANCE.getMimeContainer(mimeValue);
		assertNotNull(container);
		assertNotNull(container.getHTMLBody());
		System.out.println(container.getHTMLBody());
		assertNotNull(container.getMimeElements());
		assertFalse(container.getMimeElements().isEmpty());
	}
}
