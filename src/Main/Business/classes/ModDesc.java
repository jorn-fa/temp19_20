package Main.Business.classes;

import Main.Business.Helpers.VerificationExeption;
import Main.Business.classes.enums.Languages;
import Main.Business.classes.subclasses.L10nItems;
import Main.Business.classes.subclasses.StoreItems;
import Main.Business.classes.subclasses.implementations.Description;
import Main.Business.classes.subclasses.implementations.Title;

public class ModDesc {
	
	private int[] version = new int[4];
	
	private String author;
	private String icon;
	private Boolean multiPlayer = false;
	
	private Title title;
	private Description description;
	private StoreItems storeItems;

	private L10nItems l10nItems;
	
	
	
	public ModDesc() {
		title = new Title();
		description = new Description();
		storeItems = new StoreItems();
		l10nItems = new L10nItems();
		
	}
	
	
	
	public void  printData() {
		System.out.println("title="+ this.title.getTitleInAllLanguages());
		System.out.println("desc=" + this.description.getDescriptionInAllLanguages());
		System.out.printf("version number = %s, %s ,%s ,%s \n" ,version[0],version[1],version[2],version[3]);
		System.out.println(author);
		System.out.println(icon);
		System.out.println(multiPlayer);
		System.out.println(this.storeItems.getItems());
		System.out.println(l10nItems.getItems());
		
	}
	
	public void addDescription(Languages language, String text) {
		description.addDescription(language, text);
	}
	
	public void addTitle(Languages language, String text) {
		title.addTitle(language, text);
	}
	
	public void addStoreitem(String filename, String rootNode) throws VerificationExeption {
		storeItems.addStoreItem(filename, rootNode);
	}
	
	public void setMulti(boolean state) {
		multiPlayer=state;
	}
	
	public void addIcon(String fileName) throws VerificationExeption {
		if (fileName.length()<4) throw new VerificationExeption(fileName);
		icon=fileName;		
	}
	
	public void addVersion(int a,int b,int c,int d) {
		version[0]=a;
		version[1]=b;
		version[2]=c;
		version[3]=d;
	} 
	
	public void addAuthor(String author) throws VerificationExeption {
		if(author.length()<2) throw new VerificationExeption(author);
		this.author=author;
	}



	public void addL10nItem(String item, Languages language, String description) {
		
		l10nItems.addItem(item, language, description);
		
	}
	

}
