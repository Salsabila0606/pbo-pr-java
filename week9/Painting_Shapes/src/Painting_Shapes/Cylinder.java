package Painting_Shapes;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	//----------------------------------
	// Constructor: Sets up the Cylinder
	//----------------------------------
	public Cylinder(double r, double h) {
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	//-----------------------------------------
	// Returns the area of the Cylinder
	//-----------------------------------------
	public double area() {
		return Math.PI*radius*radius*height;
	}
	
	//-----------------------------------
	// Returns the Cylinder as a String
	//-----------------------------------
	@Override
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}
