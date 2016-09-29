package xml.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser newSAXParser = parserFactory.newSAXParser();
        SAXHandler saxHandler = new SAXHandler();
        newSAXParser.parse(ClassLoader.getSystemResourceAsStream("employee.xml"), saxHandler);
        //Printing the list of employees obtained from XML
        for ( Employee emp : saxHandler.empList){
          System.out.println(emp);
        }
	}

}

class SAXHandler extends DefaultHandler {
	
	 List<Employee> empList = new ArrayList<>();
	  Employee emp = null;
	  String content = null;
	  @Override
	  //Triggered when the start of tag is found.
	  public void startElement(String uri, String localName, 
	                           String qName, Attributes attributes) 
	                           throws SAXException {

	    switch(qName){
	      //Create a new Employee object when the start tag is found
	      case "employee":
	        emp = new Employee();
	        emp.id = attributes.getValue("id");
	        break;
	    }
	  }

	  @Override
	  public void endElement(String uri, String localName, 
	                         String qName) throws SAXException {
	   switch(qName){
	     //Add the employee to list once end tag is found
	     case "employee":
	       empList.add(emp);       
	       break;
	     //For all other end tags the employee has to be updated.
	     case "firstName":
	       emp.firstName = content;
	       break;
	     case "lastName":
	       emp.lastName = content;
	       break;
	     case "location":
	       emp.location = content;
	       break;
	   }
	  }

	  @Override
	  public void characters(char[] ch, int start, int length) 
	          throws SAXException {
	    content = String.copyValueOf(ch, start, length).trim();
	  }
	
	
}