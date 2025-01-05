public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private int age;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, int age, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}