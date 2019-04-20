package Main.Business;

import Main.Business.Helpers.VerificationExeption;
import Main.Business.classes.ModDesc;
import Main.Business.classes.enums.Languages;


public class reader2 {
	
	
	
	

	public static void main(String[] args) {
		
		
		ModDesc modDesc = new ModDesc();
		
		
		
		try {
			modDesc.addAuthor("fa285634");
			modDesc.addStoreitem("test", "test2");
			modDesc.addTitle(Languages.EN,"Title");
			modDesc.addDescription(Languages.NL, "Beschrijving");
			modDesc.setMulti(true);
			modDesc.addIcon("file.dds");
			modDesc.addVersion(1, 0, 0, 0);
			
			modDesc.addL10nItem("l10Ntest", Languages.NL, "description");
			
			
		} catch (VerificationExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		modDesc.printData();
		

	}

}
