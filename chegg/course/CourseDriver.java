public class CourseDriver{
    public static void main(String []args){
        Course c1, c2, c3, c4;
        c1 = new PhyCourse("Introduction to Physics", "Castor Troy", "201", "In this course we will learn about the basics of physics and how to apply physics in daily life.");
        c2 = new MathCourse("Algebra 201", "Matthew Potter","004", "In this course we shall learn about solving algebra equations");
        c3 = new EngCourse("English 300", "Teresa Jones","E23",  "In this course we shall learn about some great literary works of 19th century");
        c4 = new ProgCourse("Programming 101", "Bowe Ping", "P234", "In this course we will learn about programming in Java");
        c1.displayMessage();
        c2.displayMessage();
        c3.displayMessage();
        c4.displayMessage();
    }
}
