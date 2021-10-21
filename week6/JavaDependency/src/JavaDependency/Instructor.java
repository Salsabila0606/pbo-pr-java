package JavaDependency;

public class Instructor {
	private Course[] courses = new Course[2];
	private int numberOfCourses = 0;
	
	public Course[] getCourses() {
		return courses;
	}
	
	//add courses to instructors
	public void setCourses(Course course) {
		this.courses[numberOfCourses] = course;
		numberOfCourses++;
	}
	
	//print courses taught by instructors
	public void printCOurses() {
		for(int i = 0; i < courses.length; i++) {
			System.out.println(courses[i]);
		}
	}
	
	@Override
	public String toString() {
		return "Instructor{" + "courses=" + courses + "}";
	}
}
