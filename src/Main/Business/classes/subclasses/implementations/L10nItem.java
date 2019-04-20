package Main.Business.classes.subclasses.implementations;

import java.util.HashMap;

import javax.swing.text.Keymap;

import Main.Business.classes.enums.Languages;
import Main.Business.classes.subclasses.SingleTemplate;

public class L10nItem extends SingleTemplate {
	
	
	public HashMap<Languages, String> l10NInAllLanguages;
	
	
	public L10nItem() {
		l10NInAllLanguages = super.getInAllLanguages();
		
	}
	
	
	


	public HashMap<Languages, String> getL10nInAllLanguages() {		
		return l10NInAllLanguages;
	}



	public void addL10n(Languages language, String text) {
		l10NInAllLanguages.replace(language, text);
		
	}
	
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder("\n");
		
		//l10NInAllLanguages.keySet().forEach(System.out::println);
		l10NInAllLanguages.forEach((k,v)-> {
		
			sb.append(k +" "+ v + "\n");
			//System.out.println(k +" "+ v);
			
		}	);
		
		return sb.toString();
		
	}
	

}
