package namePoly;

public class Circle implements Shape {

	/**
   	* Circle has 1 private final field of type int that is called radius ?
   	*/
   	private final int radius;
   	/**
   	* It has one parameterized constructor that initializes the field
   	* r
   	*/
   	public Circle(int r)
   	{
   		radius = r;
   	}

   	/**
   	* The toString method should return a String of the following form: Circle(radius) e.g. Circle(3)
   	*/
   	public String toString()
   	{
   		return "Circle("+ radius + ")";
   	}

   	@Override
   	public double perimeter() {
       return 2.0*3.14159*radius;
   	}

   	@Override
   	public double area() {
   		return 3.14159*radius*radius;
   	}
}