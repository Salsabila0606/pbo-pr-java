package Painting_Shapes;

public abstract class Shape {
		
		//An instance variable shapeName of type String 
		private String shapeName;
		
		//An abstract method area() 
		protected abstract double area();
		
		//set name
		public Shape(String name) {
			this.shapeName = name;
		}
		
		//a toString method that returns the name of the shape 
		public String toString() {
			return shapeName;
		}
}
