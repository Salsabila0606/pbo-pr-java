package The_Avenged;

public class FlyingDutchMan extends SuperHero {

	public FlyingDutchMan(int pl, String name) {
		super(pl,name);
		Power flying = new Flying();
		Power laser = new LaserEye();
		super.addPower(flying);
		super.addPower(laser);
	}
	
	@Override
	public void identity() {
		System.out.println("================================");
		System.out.println("It's "+ super.getName() + ", the FlyingDutchMan! It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
		System.out.println("TIME TO SHOW YOU MY POWERS");
	}
	
}

