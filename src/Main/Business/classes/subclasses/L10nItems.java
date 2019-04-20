package Main.Business.classes.subclasses;

import java.util.HashMap;

import Main.Business.classes.enums.Languages;
import Main.Business.classes.subclasses.implementations.L10nItem;

public class L10nItems {
	
	
	private HashMap<String, L10nItem> l10nItems;
	
	public L10nItems() {
		l10nItems=new HashMap<>();
	}
	

	public void addItem(String textItem, Languages language, String description) {
		
		
		if (l10nItems.containsKey(textItem)){}
		
		else {
		
		L10nItem item= new L10nItem();
		
		item.addL10n(language, description);
		
		l10nItems.put(textItem, item);
		
		}
		
		
		
		
		
	
		
	}

	public HashMap<String, L10nItem> getItems() {
		
		return l10nItems;
	}
	
	
	
	
	
	
	

}
