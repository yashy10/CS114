import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
       return this.id - other.id;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(3, "Charlie"));

        Collections.sort(students); // Uses compareTo method

        for (Student s : students) {
            System.out.println(s.id + " " + s.name); // Output: Sorted by id
        }
    }
}