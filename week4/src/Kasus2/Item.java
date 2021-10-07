package Kasus2;

public class Item {
	
	private String name;
	//private String Item; //bisa dua duanya
	private Item() {
		name = "Ipin";
	}
	
	public Item(String name) { 
		this.name = "Ipin";
		System.out.println(this.name);
	}
	
}

