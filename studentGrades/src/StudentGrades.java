import java.util.Scanner;

class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}
class Course {
    private String courseTitle;

    public Course(String courseTitle){
        this.courseTitle = courseTitle;
    }
}

class Grades extends Student{
    private String courseTitle;

    public Grades(String name, int id, String courseTitle){
        super(name,id);
        this.courseTitle = courseTitle;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Course: " + courseTitle);
    }

}

public class StudentGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        System.out.println("Please enter your ID:");
        int id = input.nextInt();
        input.nextLine();

        Student student = new Student(name, id);
        student.displayInfo();

        System.out.println("Please enter your course title: ");
        String courseTitle = input.nextLine();

        Course course = new Course(courseTitle);
        course.displayCourseTitle();

        Grades grades = new Grades(name, id, courseTitle);
        grades.displayInfo();

    }
}