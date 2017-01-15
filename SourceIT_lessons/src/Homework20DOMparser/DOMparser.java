package Homework20DOMparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class description
 *
 * @author lobseer
 * @version 19.12.2016
 */

public class DOMparser {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        String path = "SourceIT_lessons/src/Homework20DOMparser/person.xml";

        Person person = new Person();

        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(path);
        Element rootElement = document.getDocumentElement();
        //NodeList nodeList = document.getDocumentElement().getChildNodes();

        person.setId(Integer.parseInt(rootElement.getAttribute("id")));

        for(Node node = rootElement.getFirstChild(); node != null; node = node.getNextSibling())
        //for(int i=0; i<nodeList.getLength(); i++)
        {
            //Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                if("name".equals(node.getNodeName())) {
                    for(Node nameNode = node.getFirstChild(); nameNode != null; nameNode = nameNode.getNextSibling()) {

                        if(nameNode.getNodeType() == Node.ELEMENT_NODE) {
                            if("firstName".equals(nameNode.getNodeName())) {
                                person.setFirstName(nameNode.getFirstChild().getNodeValue());
                            } else
                            if("lastName".equals(nameNode.getNodeName())) {
                                person.setLastName(nameNode.getFirstChild().getNodeValue());
                            }
                        }
                    }
                } else
                if("login".equals(node.getNodeName())) {
                    person.setLogin(node.getFirstChild().getNodeValue());
                } else
                if("permission".equals(node.getNodeName())) {
                    for(Node nameNode = node.getFirstChild(); nameNode != null; nameNode = nameNode.getNextSibling()) {
                        if(nameNode.getNodeType() == Node.ELEMENT_NODE) {
                            if("document".equals(nameNode.getNodeName())) {
                                person.setDocumentName(nameNode.getFirstChild().getNodeValue());
                            } else
                            if("pages".equals(nameNode.getNodeName())) {
                                person.setPages(Integer.parseInt(nameNode.getFirstChild().getNodeValue()));
                            }
                        }
                    }
                } else
                if("documents".equals(node.getNodeName())) {
                    ArrayList<String> docs = new ArrayList<>();
                    for(Node nameNode = node.getFirstChild(); nameNode != null; nameNode = nameNode.getNextSibling()) {
                        if(nameNode.getNodeType() == Node.ELEMENT_NODE) {
                            if("doc".equals(nameNode.getNodeName())) {
                                docs.add(nameNode.getFirstChild().getNodeValue());
                            }
                        }
                    }
                    person.setDocs(docs);
                }
            }
        }
        System.out.println(person);
    }
}
