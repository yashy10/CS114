public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, int age, String emailAddress, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, age, emailAddress, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + super.toString().split(", Name: ")[1] + ", Title: " + title;
    }
}