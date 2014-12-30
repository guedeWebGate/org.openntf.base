package org.openntf.base.jaxb.dxl.testsuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.InputStream;

import org.junit.Test;
import org.openntf.base.jaxb.dxl.Document;
import org.openntf.base.jaxb.dxl.Item;
import org.openntf.base.jaxb.dxl.Richtext;
import org.openntf.base.jaxb.utils.ConvertorFactory;

public class ConverterFactoryTest {

	@Test
	public void testConvertDXLTestDocumentToDocument() {
		InputStream isXML = ConverterFactoryTest.class.getResourceAsStream("dxl-document-test-nosys.xml");
		Document docConverted = ConvertorFactory.convert2DXLDocumentFromStream(isXML);
		assertNotNull(docConverted);
	}
	
	@Test
	public void testFindRTItemInTestDocument() {
		InputStream isXML = ConverterFactoryTest.class.getResourceAsStream("dxl-document-test-nosys.xml");
		Document docConverted = ConvertorFactory.convert2DXLDocumentFromStream(isXML);
		assertNotNull(docConverted);
		Richtext richText = null;
		Item itemFound = null;
		for (Item itemcheck :docConverted.getItem()) {
			if (itemcheck.getRichtext() != null){
				itemFound = itemcheck;
				richText = itemcheck.getRichtext();
				break;
			}
		}
		assertNotNull(richText);
		assertEquals("bodyClient", itemFound.getName());
	}
}
