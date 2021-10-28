package Task2;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(){
		this.radius = 0.1;
	}
	
	public Circle (double r) {
		this.radius = r;
	}
	
	public Circle(double r, String c, boolean f) {
		this.radius = r;
		super.setColor(c);
		super.setFilled(f);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter(){
		return Math.PI*2*radius;
	}
	
	@Override
	public String toString(){
		return "A circle with radius = " + radius + ", which is a subclass of " + super.toString();
	}
}
