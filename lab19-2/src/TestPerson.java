
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Li", "1233 Roodward St", "892-8273", 120, "li@example.com");
        Student student = new Student("Yuki", "456 College Ave", "555-5678", 20, "yuki@example.edu", Student.JUNIOR);
        MyDate hireDate = new MyDate(2015, 6, 15);
        Employee employee = new Employee("Hiroshi", "789 Corporate Rd", "555-9101", 45, "hiroshi@company.com", 75000, hireDate);
        Faculty faculty = new Faculty("Mei", "321 Campus Dr", "555-1122", 50, "mei@university.edu", 90000, hireDate, "Mon and Wed 9-11am", 3);
        Staff staff = new Staff("Jun", "987 Admin Blvd", "555-3344", 35, "jun@org.com", 50000, hireDate, "HR Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
