package Main.Business;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReaderLaptop extends Reader {

	public static void main(String[] args) {
		
		ReaderLaptop reader = new ReaderLaptop();
		// TODO Auto-generated method stub

		String laptop = "C:\\\\Users\\\\fa285\\\\OneDrive\\\\examen 2020\\\\FS19_SX_IT\\\\modDesc.xml";
		
		
			 reader.runMe(laptop);
	     
	}

}
