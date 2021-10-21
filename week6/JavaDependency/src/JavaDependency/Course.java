package JavaDependency;

public class Course {
	private String courseName = "Unknown";

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return "Course{" + "courseName=" + courseName + "}";
	}
}
