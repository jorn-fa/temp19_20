package Main.Business.classes.subclasses;


	import java.util.HashMap;

import javax.annotation.Resource;

import Main.Business.Helpers.PartProvider;
import Main.Business.classes.enums.Languages;

	@Resource
	public class SingleTemplate {
		
		
		private PartProvider partProvider;
		
		
		
		
		public SingleTemplate() {
			partProvider = new PartProvider();	
			
		}

		public HashMap<Languages, String> getInAllLanguages() {
			
			return partProvider.getAllLanguageMap();
		}	
			
		

	}



