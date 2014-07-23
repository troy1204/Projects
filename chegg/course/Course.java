public class Course{
    public String courseName;
    public String instructor;
    public String courseId;
    public String description;
    public Course(String name, String instName, String id, String desc){
        courseName = name;
        instructor = instName;
        courseId = id;
        description = desc;
    }
    public void displayMessage(){
        System.out.println("Course name is " + courseName);
        System.out.printf("Course ID is " +  courseId ); 
        System.out.printf("Course Instructor is " +  instructor ); 
        System.out.printf("Course Description : " +  description ); 
    }
}