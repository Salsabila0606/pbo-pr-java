package Task2;

public class Shape {
	
	private String color;
	private boolean filled;
	
	//constructor 1
	public Shape () {
		color = "green";
		filled = true;
	}
	
	//constructor 2
	public Shape (String c, boolean f) {
		c = color;
		f = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if (isFilled()) {
			return " A Shape with color of " + color + " and filled";
		} else {
			return " A Shape with color of " + color + " and not filled";
		}
	}
	
}
