package org.openntf.base.jaxb.dxl.testsuite;

import java.io.InputStream;

import org.junit.Test;
import org.openntf.base.jaxb.dxl.Document;
import org.openntf.base.jaxb.dxl.Item;
import org.openntf.base.jaxb.dxl.Richtext;
import org.openntf.base.jaxb.utils.ConvertorFactory;

import static org.junit.Assert.*;

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
		System.out.println(docConverted.getItem().size());
		System.out.println(docConverted.getNoteinfo());
		System.out.println(docConverted.getUpdatedby());
		for (Item itemcheck :docConverted.getItem()) {
			System.out.println(itemcheck.getName());
			if (itemcheck.getRichtext() != null){
				richText = itemcheck.getRichtext();
				break;
			}
		}
		assertNotNull(richText);
	}
}
