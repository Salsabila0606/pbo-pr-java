package JavaAssociation;

import java.util.List;
import java.util.ArrayList;

public class mainProgram {
		
	public static void main(String[] args) {
		Mentee M1 = new Mentee();
		M1.Name = "Salsa";
		Mentee M2 = new Mentee();
		M2.Name = "Anggi";
		Mentee M3 = new Mentee();
		M3.Name = "Jane";
		Mentee M4 = new Mentee();
		M4.Name = "Adi";
		
		List<Mentee> MenteeGroup1 = new ArrayList<>();
		MenteeGroup1.add(M1);
		MenteeGroup1.add(M2);
		
		Mentor R1 = new Mentor();
		R1.Name = "Luda";
		R1.Mentoring(MenteeGroup1);
	}
}
