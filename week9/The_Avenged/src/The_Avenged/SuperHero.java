package The_Avenged;

import java.util.*;

abstract class SuperHero {
	protected int powerLevel;
	protected String name;
	protected List <Power> powerList;
	
	public SuperHero(int pl, String name){
		this.powerLevel = pl;
		this.name = name;
		this.powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel(){
		return powerLevel;
	}
	
	public String getName(){
		return name;
	}
	
	public void addPower(Power power){
		powerList.add(power);
	}
	
	public abstract void identity();
	
	public void showPowers() {
		for (Power power : powerList) {
			power.doPower();
		}
		System.out.println("===============================");
	}	
}
