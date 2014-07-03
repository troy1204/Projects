public class GradeBook
{
    public String courseName;
    public String instructor;

    public GradeBook(String name, String iname){
        courseName = name;
        instructor = iname; //Add instructor's name to contructor
    }

    public void setCourseName(String name){
        courseName = name;
    }

    public String getCourseName(){
        return courseName;
    }

    //set method to change instructor's name
    public void setInstructor(String iname){
        instructor = iname;
    }

    //get method to retrieve instructor's name
    public String getInstructor(){
        return instructor;
    }

    public void displayMessage(){
        System.out.printf("Welcome to the grade book for\n%s!\n", courseName);
        System.out.printf("This course is presented by\n%s\n", instructor ); //Update to also display instructors name
    }
}

