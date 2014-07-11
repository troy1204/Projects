import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Student{ //Student class
    String name; //Student name
    int id; //Student id
    int g[] = new int[6]; //Member vaiables for grades
    int average; //To store student's average grade
    String status; //To store student's status

    int avg(){ //Calculate student's average grade by adding all 6 entered grades and dividing by 6
        int sum=0;
        for(int i=0; i<6; i++){
            sum += g[i];
        }
        return sum/6;
    }

    //Display method to display the status based on average grade
    String display(int a, int grad[]){ 
        int high = grad[0];
        int low = grad[0];
        String s = "";
        if(a < 70){
            s = "Average grade is " + a +" Status : POOR";
        }
        else if(a >= 85){
            s = "Average grade is " + a +" Status : GREAT";
        }
        else if(a >=70 && a < 85){
            s = "Average grade is " + a +" Status : FAIR";
        }
        for(int i=0; i<6; i++){
            if(grad[i] > high)
                high = grad[i];
        }

        for(int i=0; i<6; i++){
            if(grad[i] < low)
                low = grad[i];
        }
        s = s + ". Highest grade is " + high + " .Lowest grade is " + low;
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        Console console = System.console(); //To read input data from console
        System.out.println("Enter number of students");
        int num = Integer.parseInt(console.readLine()); //Read number of students
        File file = new File("name.txt"); //File to save all the results
        Student[] st = new Student[num]; //Create and array of Students based on number of students input
        for(int i=0; i<num; i++){ //Run a for loop for number of students input
            //Collect all the data like name, id and grades and store them in class member variables
            Student s = new Student();
            System.out.println("Enter student name : ");
            s.name = console.readLine();
            System.out.println("Enter student id : ");
            s.id = Integer.parseInt(console.readLine());
            for(int j=0; j<6; j++){
                System.out.println("Enter grade " + j + " : ");
                s.g[j] = Integer.parseInt(console.readLine());
            }

            s.average = s.avg(); //Call avg function to get average grade
            s.status = s.display(s.average, s.g); //Display the result
            st[i] = s;
            try{
                if (!file.exists()) { //If file does not exist then create new file
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
                BufferedWriter bw = new BufferedWriter(fw);
                //Write all the results using BufferedWriter
                bw.newLine();
                bw.write("Student name : " + s.name);
                bw.newLine();
                bw.write("Student id : " + Integer.toString(s.id));
                bw.newLine();
                bw.write(s.status);
                bw.newLine();
                bw.close(); //Close BufferedWriter
            }
            catch(IOException ioe){
                System.out.println("Error occurred when writing to file");
            }
        }
        
    }
}
