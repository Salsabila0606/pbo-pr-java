package JavaDependency;

public class JavaApplication {
	
	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		Course java = new Course();
		java.setCourseName("Introduction to Java Programming");
		Course c = new Course();
		c.setCourseName("Programming C");
		
		//adding two couurses for one instructor
		instructor.setCourses(java);
		instructor.setCourses(c);
		
		//print number of courses taught by one instructor
		//System.out.println(instructor.toString());
		
		instructor.printCOurses();
	}
}
