
public class Faculty extends Employee {
    private String officeHours;
    private int rank;

    public Faculty(String name, String address, String phoneNumber, int age, String emailAddress, double salary, MyDate dateHired, String officeHours, int rank) {
        super(name, address, phoneNumber, age, emailAddress, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public int getRank() {
        return rank;
    }

    public int salaryRange(int currentYear) {
        int years = currentYear - getDateHired().getYear();
        int product = rank * years;
        if (product < 10) {
            return 1;
        } else if (product < 20) {
            return 2;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + super.toString().split(", Name: ")[1] + ", Office Hours: " + officeHours + ", Rank: " + rank;
    }
}
