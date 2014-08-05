package namePoly;
import java.awt.print.*;

public interface Shape {
 
    //implicitly public, static and final
    public String LABLE="Shape";
     
    //interface methods are implicitly abstract and public
     
    double area();

    String toString();

    double perimeter();
}