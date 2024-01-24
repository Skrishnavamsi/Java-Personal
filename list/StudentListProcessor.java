import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " with GPA: " + GPA;
    }
}

public class StudentListProcessor {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Doe", 2.8));
        students.add(new Student("Alice", "Johnson", 3.7));
        students.add(new Student("Bob", "Smith", 2.3));

        double sum = 0;
        for (Student student : students) {
            sum += student.GPA;
        }
        double averageGPA = sum / students.size();

        // Using an iterator to avoid ConcurrentModificationException
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().GPA < averageGPA) {
                iterator.remove();
            }
        }

        // Print remaining students
        System.out.println("Students with GPA above average:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
