package org.openntf.base.jaxb.dxl.testsuite;

import java.io.InputStream;

import org.junit.Test;
import org.openntf.base.jaxb.dxl.Document;
import org.openntf.base.jaxb.utils.ConvertorFactory;
import static org.junit.Assert.*;

public class ConverterFactoryTest {

	@Test
	public void testConvertDXLTestDocumentToDocument() {
		InputStream isXML = ConverterFactoryTest.class.getResourceAsStream("dxl-document-test.xml");
		Document docConverted = ConvertorFactory.convert2DocumentFromStream(isXML);
		assertNotNull(docConverted);
	}
}
