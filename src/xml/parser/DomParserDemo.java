package xml.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserDemo {
	  public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException  {
		  List<Employee> empList = new ArrayList<Employee>();
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();// AbstractFactory implemented as singleton
		  
		  DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		  
		  //Load and Parse the XML document
		  
		  Document document = documentBuilder.parse(ClassLoader.getSystemResourceAsStream("employee.xml"));
		  //Iterating through the nodes and extracting the data.
		    NodeList nodeList = document.getDocumentElement().getChildNodes();

		    for (int i = 0; i < nodeList.getLength(); i++) {

		      //We have encountered an <employee> tag.
		      Node node = nodeList.item(i);
		      if (node instanceof Element) {
		        Employee emp = new Employee();
		        emp.id = node.getAttributes().
		            getNamedItem("id").getNodeValue();

		        NodeList childNodes = node.getChildNodes();
		        for (int j = 0; j < childNodes.getLength(); j++) {
		          Node cNode = childNodes.item(j);

		          //Identifying the child tag of employee encountered. 
		          if (cNode instanceof Element) {
		            String content = cNode.getLastChild().
		                getTextContent().trim();
		            switch (cNode.getNodeName()) {
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
		        }
		        empList.add(emp);
		      }

		    }

		    //Printing the Employee list populated.
		    for (Employee emp : empList) {
		      System.out.println(emp);
		    }

	  }
}
