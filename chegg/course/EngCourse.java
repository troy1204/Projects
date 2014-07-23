public class EngCourse extends Course{
    public EngCourse(String name, String instName, String id, String desc){
        super(name, instName, id, desc);
    }
    public void displayMessage(){
        System.out.println("This course is offered by the English Department.");
        System.out.println("Course name is " + courseName);
        System.out.println("Course ID is " +  courseId ); 
        System.out.println("Course Instructor is " +  instructor ); 
        System.out.println("Course Description : " +  description );
        System.out.println("--------------------------------------");
    }
}
