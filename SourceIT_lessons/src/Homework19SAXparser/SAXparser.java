package Homework19SAXparser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class description
 *
 * @author lobseer
 * @version 19.12.2016
 */

public class SAXparser {

    static class HandlerForPerson extends DefaultHandler {
        StringBuilder sb = new StringBuilder();
        //List<String> tags = Arrays.asList(new String[]{"firstName", "lastName", "login"});
        Person person;
        ArrayList<String> docs = new ArrayList<>();

        HandlerForPerson(Person person) {
            this.person = person;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            sb = new StringBuilder();

            if (qName.equals("person")) {
                person.setId(Integer.parseInt(attributes.getValue("id")));
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String str = new String(ch);
            String result = str.substring(start, start+length);
            sb.append(result);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase("firstname")) {
                person.setFirstName(sb.toString().trim());
            }
            if (qName.equalsIgnoreCase("lastname")) {
                person.setLastName(sb.toString().trim());
            }
            if (qName.equalsIgnoreCase("login")) {
                person.setLogin(sb.toString().trim());
            }
            if (qName.equalsIgnoreCase("doc")) {
                docs.add(sb.toString().trim());
            }
            if(qName.equalsIgnoreCase("documents")) {
                person.setDocs(docs);
            }
            sb = new StringBuilder();
        }
    }

    static class HandlerForStaff extends DefaultHandler {
        StringBuilder sb;
        Staff myStaff;

        HandlerForStaff(Staff staff) {
            this.myStaff = staff;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            sb = new StringBuilder();
            if(qName == "staff")
                myStaff.setId(Integer.parseInt(attributes.getValue("id")));
            if(qName == "salary")
                myStaff.setRegularSalary(Boolean.parseBoolean(attributes.getValue("isRegular")));
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String str = new String(ch);
            String result = str.substring(start, start+length);
            sb.append(result);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase("firstName")) {
                myStaff.setFirstName(sb.toString().trim());
            }
            if (qName.equalsIgnoreCase("lastName")) {
                myStaff.setLastName(sb.toString().trim());
            }
            if (qName.equalsIgnoreCase("nikName")) {
                myStaff.setNikName(sb.toString().trim());
            }
            if (qName.equalsIgnoreCase("salary")) {
                myStaff.setSalary(Double.parseDouble(sb.toString().trim()));
            }
            sb = new StringBuilder();
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        SAXParser saxParser = factory.newSAXParser();
        String path = "SourceIT_lessons/src/Homework19SAXparser/staff.xml";
        Staff myStaff = new Staff();

        saxParser.parse(path, new HandlerForStaff(myStaff));

        System.out.println(myStaff);

        /////////////////////////////////////////////////////

        SAXParser saxParser2 = factory.newSAXParser();
        String path2 = "SourceIT_lessons/src/Homework19SAXparser/person.xml";
        Person person =  new Person();

        saxParser2.parse(path2, new HandlerForPerson(person));

        System.out.println(person);
    }
}
