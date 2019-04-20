package Main.Business.classes.subclasses.implementations;

import java.util.HashMap;

import Main.Business.classes.enums.Languages;
import Main.Business.classes.subclasses.SingleTemplate;

public class Description extends SingleTemplate{
	
	public HashMap<Languages, String> descriptionInAllLanguages;
	
	
	public Description() {
		descriptionInAllLanguages = super.getInAllLanguages();
		
	}
	
	
	
	
	public HashMap<Languages, String> getDescriptionInAllLanguages() {		
		return descriptionInAllLanguages;
	}



	public void addDescription(Languages language, String text) {
		descriptionInAllLanguages.replace(language, text);
		
	}
	

}
