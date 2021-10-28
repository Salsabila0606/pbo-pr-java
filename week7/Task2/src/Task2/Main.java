package Task2;

public class Main {
	
	public static void main (String[] args) {
		Shape s1 = new Shape();
		System.out.println(s1.toString());
		
		Shape s2 = new Shape("blue", true);
		System.out.println(s2.toString());
		
		System.out.println("--------------------");
		
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		
		Rectangle r2 = new Rectangle(5.0, 5.0);
		System.out.println(r2.toString());
		
		Square sq1 = new Square();
		System.out.println(sq1.toString());
	}
}
