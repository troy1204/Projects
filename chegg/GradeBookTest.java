import java.io.*;
public class GradeBookTest
{
   public static void main( String args[] )
   { 
        String c1="",i1=""; 
        System.out.println("Enter course 1");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            c1 =  br.readLine(); //Read course name entered by user
            System.out.println("Enter instructor's name for course 1");
            i1 =  br.readLine(); //Read instructor's name entered by user
        }
        catch(IOException ioe) {
            System.out.println("Bad input");
        }
        
        GradeBook myGradeBook1 = new GradeBook(c1,i1); //Create 1st GradeBook object with user entered input
        myGradeBook1.displayMessage();

        GradeBook myGradeBook2 = new GradeBook("CIS 250OM", "AWESOME INSTRUCTOR"); //Create 2nd GradeBook object based on CIS 250OM
        myGradeBook2.displayMessage();
    } 

} 
