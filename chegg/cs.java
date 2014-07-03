import java.io.*;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
public class cs{

    public static void main(String []args){
        boolean keepRunning = true;  
        int cs = 0;
        double irate = 0.0;
        while(keepRunning){
            System.out.println("Enter credit score");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try{
                cs =  Integer.parseInt(br.readLine());
                keepRunning = false;
            }
            catch(IOException ioe) {
                System.out.println("Could not read input credit!");
                keepRunning = true;
            }
            catch(NumberFormatException nfe) {
                System.out.println("Invalid credit score!");
                keepRunning = true;
            }
            catch(InputMismatchException exception){
                System.out.println("Entered credit score is not an integer!");
                keepRunning = true;
            }
        }
        
        System.out.println("The user endered credit score is : " + cs);
        if(cs < 590){
            System.out.println("Credit score too low. No credit can be issued");
        }
        else if(cs >= 590 && cs <= 624){
            irate = 12.45;
        }
        else if(cs >= 625 && cs <= 659){
            irate = 9.34;
        }
        else if(cs >= 660 && cs <= 689){
            irate = 7.12;
        }
        else if(cs >= 690 && cs <= 719){
            irate = 6.38;
        }
        else if(cs >= 720 && cs <= 850){
            irate = 5.56;
        }        
        if(irate > 0.0){
            System.out.println("Interest rate is : " + irate + " %");
        }   
    }
}

