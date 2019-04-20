package Main.Business.classes.subclasses;

import java.util.HashMap;

import Main.Business.Helpers.VerificationExeption;

public class StoreItems {
	
	private HashMap<String,String> items;
	
	
	public StoreItems() {
		items = new HashMap<>();
	}
	
	
	

	
	
	public void addStoreItem(String filename, String rootNode ) throws VerificationExeption 
	{
		if(filename.length()<4) {throw new VerificationExeption(filename);}
		if(rootNode.length()<4) {throw new VerificationExeption(rootNode);}		
		
		items.put(filename, rootNode);
		
	}
	
	
	
	public HashMap<String, String> getItems() {
		return items;
	}
	
	
	
	
	
}
