package Main.Business.Helpers;

import java.util.HashMap;

import Main.Business.classes.enums.Languages;

public class PartProvider {
	
	private Languages languages;
	
	
	
	
	public HashMap<Languages, String>  getAllLanguageMap() {			
		
		return fillWithLanguages();
	}
	
	
	
	
		
	
	private HashMap<Languages, String> fillWithLanguages() {
		HashMap<Languages, String> allLanguages = new HashMap<Languages,String>();
		
		for (Languages input : Languages.values()) {
			
			allLanguages.put(input, "");
			
			
		}
		
		return allLanguages;
	}
	
	

}
