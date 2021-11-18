package The_Avenged;

import java.util.*;

public class AvengedSimulator {
	
	public static void main(String[] args) {
		
		ArrayList<SuperHero> superhero = new ArrayList<SuperHero>();
		//unsorted
		superhero.add(new ManRay(0, "Gennichiro"));
		superhero.add(new FlyingDutchMan(36556, "Tatenari"));
		superhero.add(new ManRay(553, "Gyoubu Masataka Oniwa"));
		superhero.add(new FlyingDutchMan(225, "Shirai"));
		superhero.add(new DirtyBubble(666, "Arnastria"));
		
		//class sort
		Collections.sort(superhero, new Sort());
		
		//sorted
		for (SuperHero s: superhero) {
			s.identity();
			s.showPowers();
		}
	}
}
