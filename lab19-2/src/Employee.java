public class Employee extends Person {
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, int age, String emailAddress, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, age, emailAddress);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + super.toString().split(", Name: ")[1] + ", Salary: " + salary + ", Date Hired: " + dateHired;
    }
}
