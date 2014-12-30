package org.openntf.base.jaxb.dxl.testsuite;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.apache.james.mime4j.MimeException;
import org.junit.Test;
import org.openntf.base.jaxb.dxl.Document;
import org.openntf.base.jaxb.utils.ConvertorFactory;
import org.openntf.base.jaxb.utils.MimeSupport;
import org.openntf.base.mime.MimeContainer;
import org.openntf.base.mime.MimeElement;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

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
	public void buildMimeMultiPart() throws IOException, MimeException, SAXException {
		InputStream isXML = ConverterFactoryTest.class.getResourceAsStream("dxl-document-test-nosys.xml");
		Document docConverted = ConvertorFactory.convert2DXLDocumentFromStream(isXML);
		assertNotNull(docConverted);
		String mimeValue = MimeSupport.INSTANCE.getMimeStringFromDocument(docConverted, "bodyXPages");
		MimeContainer container =MimeSupport.INSTANCE.getMimeContainer(mimeValue);
		assertNotNull(container);
		assertNotNull(container.getHTMLBody());
		assertNotNull(container.getMimeElements());
		assertFalse(container.getMimeElements().isEmpty());
		assertNotNull(container.getHTMLDOM());
		print(container.getHTMLDOM(),"");
	}
	
	@Test
	public void getRawDataToMimeElement() throws IOException, MimeException, SAXException {
		InputStream isXML = ConverterFactoryTest.class.getResourceAsStream("dxl-document-test-nosys.xml");
		Document docConverted = ConvertorFactory.convert2DXLDocumentFromStream(isXML);
		assertNotNull(docConverted);
		String mimeValue = MimeSupport.INSTANCE.getMimeStringFromDocument(docConverted, "bodyXPages");
		MimeContainer container =MimeSupport.INSTANCE.getMimeContainer(mimeValue);
		assertNotNull(container);
		assertNotNull(container.getHTMLBody());
		assertNotNull(container.getMimeElements());
		assertFalse(container.getMimeElements().isEmpty());
		assertNotNull(container.getHTMLDOM());
		MimeSupport.INSTANCE.checkElementsForMissingData(container.getMimeElements(), docConverted);
		for (MimeElement element: container.getMimeElements()){
			if ("<02>".equals(element.getHeaders().get("Content-ID"))) {
				assertNotNull(element.getBinaryData());
			}
		}
		
	}
	
	public void print(Node node, String indent) {
        System.out.println(indent+node.getClass().getName() +" /// "+ node.getNodeName() + (node instanceof Element ? "-->"+((Element)node).getNodeValue(): ""));
        Node child = node.getFirstChild();
        while (child != null) {
            print(child, indent+" ");
            child = child.getNextSibling();
        }
    }
}
