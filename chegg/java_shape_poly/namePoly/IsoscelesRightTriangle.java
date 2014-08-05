package namePoly;
import java.awt.print.*;

public class IsoscelesRightTriangle implements Shape, Printable {

   	/**
   	* 1 private final field of type int that is called leg ?
   	*/
   	private final int leg;
   	/**
   	* It has one parameterized constructor that initializes the field ?
   	* @param a
   	*/
   	public IsoscelesRightTriangle(int a)
   	{
   		leg = a;
   	}
   	/**
   	* It has a public method called hypotenuse that returns a value of type double ?
   	* @return
   	*/
   	public double hypotenuse()
   	{
   		return Math.sqrt(leg*leg+ leg*leg);
   	}

   	/**
   	* It provides a getter for the field but no setter
   	* @return
   	*/
   	public int getLeg() { return leg; }
   	/**
   	* The toString method should return a String of the following form: IsoscelesRightTriangle(leg) e.g. IsoscelesRightTriangle(5)
   	*/
   	public String toString()
   	{
   		return "IsoscelesRightTriangle("+ this.leg + ")";
   	}
   	
   	public void print() {
       System.out.println("This method will print *");
      
   	}
   	
   	public double perimeter() {
       return leg + leg + this.hypotenuse();
   	}
   	
   	public double area() {
       return 0.5 * leg * leg;
   	}
}