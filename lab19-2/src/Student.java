public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String classStatus;

    public Student(String name, String address, String phoneNumber, int age, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, age, emailAddress);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + super.toString().split(", Name: ")[1] + ", Status: " + classStatus;
    }
}