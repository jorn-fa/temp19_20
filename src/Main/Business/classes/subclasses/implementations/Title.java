package Main.Business.classes.subclasses.implementations;

import java.util.HashMap;

import javax.annotation.Resource;

import Main.Business.classes.enums.Languages;
import Main.Business.classes.subclasses.SingleTemplate;

@Resource
public class Title extends SingleTemplate {
	
	
	private HashMap<Languages, String> titleInAllLanguages;
	
	public Title() {
		
		titleInAllLanguages = super.getInAllLanguages(); }
	
	public HashMap<Languages, String> getTitleInAllLanguages() {		
		return titleInAllLanguages;
	}
	
	
	public void addTitle(Languages language, String text) {
		titleInAllLanguages.replace(language, text);
		
	}
	
	
}
	