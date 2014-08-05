package namePoly;
import java.awt.print.*;

public class adInterfaceApp{
	public static void main(String[] args){
		Shape myIsoscelesRightTriangle = new IsoscelesRightTriangle(5); 
		System.out.println(myIsoscelesRightTriangle.perimeter());
		System.out.println(myIsoscelesRightTriangle.area());
	}
}