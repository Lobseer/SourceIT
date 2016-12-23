package Lesson18XMLserialize;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Class description
 *
 * @author lobseer
 * @version 19.12.2016
 */

public class DOMparser {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("SourceIT_lessons/src/Lesson18XMLserialize/person.xml");
        //prettyPrint(document);
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        //printAttributesInfo(document.getDocumentElement());
        System.out.println();

        for(int i=0; i<nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                if("login".equals(node.getNodeName())) {
                    System.out.println(node.getFirstChild().getNodeValue());
                }
            }
        }

    }
}
