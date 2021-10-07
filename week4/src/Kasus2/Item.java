package Kasus2;

public class Item {
	
	private String name;
	
	private Item() {
		name = "Ipin";
	}
	
	public Item(String name) { 
		this();							//akses ke private Item
		System.out.println(this.name);	//print nama yang ada di var Item
	}
	
}

