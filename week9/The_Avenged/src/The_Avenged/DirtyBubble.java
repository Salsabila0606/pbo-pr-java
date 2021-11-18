package The_Avenged;

public class DirtyBubble extends SuperHero {
	
	public DirtyBubble(int pl, String name) {
		super(pl,name);
		Power strength = new Strength();
		Power flying = new Flying();
		super.addPower(strength);
		super.addPower(flying);
	}
	
	@Override
	public void identity() {
		System.out.println("================================");
		System.out.println("It's "+ super.getName() + ", the DirtyBubble! It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
		System.out.println("TIME TO SHOW YOU MY POWERS");
	}
	
}
