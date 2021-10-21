package JavaAssociation;

import java.util.List;

public class Mentor {
	
	public String Id;
	public String Name;
	public String Address;
	
	public void Mentoring(List<Mentee> Mentees) {
		System.out.println(this.Name + " is mentor of mentee :");
		for (Mentee xMentee : Mentees) {
			System.out.println(xMentee.Name);
		}
	}
}
