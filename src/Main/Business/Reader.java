package Main.Business;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
	        //laptop
			String where = "C:\\\\Users\\\\fa285\\\\OneDrive\\\\examen 2020\\\\FS19_SX_IT\\\\modDesc.xml";
	        //pc
			where = "C:\\Users\\Jorn\\OneDrive\\examen 2020\\FS19_SX_IT\\modDesc.xml";
			
			File inputFile = new File(where);
	        
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.print("Root element: ");
	         System.out.println(doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("modDesc");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            //System.out.println(nNode.getNodeValue() );
	            
	            checkNode(nNode,"title");
	            checkNode(nNode,"version");
	            checkNode(nNode,"iconFilename");
	            checkNode(nNode,"multiplayer");
	            checkNode(nNode,"storeItems");
	            checkNode(nNode ,"description");
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   
	}

	private static void checkNode(Node nNode, String verify) {
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		   Element eElement = (Element) nNode;
		   //System.out.print("\ncompany : ");
		   
		   //System.out.println(eElement.getAttribute(verify));
		   NodeList carNameList = eElement.getElementsByTagName(verify);
		   
		   for (int count = 0; count < carNameList.getLength(); count++) {
		      Node node1 = carNameList.item(count);
		      
		      if (node1.getNodeType() == node1.ELEMENT_NODE) {
		         Element element = (Element) node1;
		         System.out.println(verify + " : " + element.getTextContent() + " ");
		         
		         if (element.hasChildNodes()){
		         
			         System.out.println(element.getChildNodes().getLength());
			         
			         NodeList internal = element.getChildNodes();
			         
			         for(int a = 0;a<internal.getLength();a++) {
			        	 Node node2 = internal.item(a);
			        	 if (node2.getNodeType() == node2.ELEMENT_NODE) {
			        		 Element element2 = (Element) node2;
			        		 
			        		 
			        		 if(element2.hasAttribute("xmlFilename")) {
			        		 System.out.print("filename = \"");
			        		 System.out.print(element2.getAttribute("xmlFilename"));    	
			        		 System.out.print("\" RootNode = ");
			        		 System.out.print(element2.getAttribute("rootNode"));
			        		 System.out.println();		        		      		
			        		 }
			        		 
			        		 
		        		 		        		 
		        	 }
		        	 
		         }
		         
		         }
		         
		        
		         
		         if (element.hasAttributes()) {
		        	 System.out.print("\tattributes : ");		         
		         System.out.println("supported:" + element.getAttribute( "supported"));
		         
		         
		         }
		         
		      }
		   }
		}
	}

}
