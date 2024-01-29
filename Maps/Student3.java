package Maps;

import java.util.HashMap;
import java.util.Map;

public class Student3 {
    private final String FirstName;
    private final String LastName;
    private final double GPA;

    // Constructor
    public Student3(String firstName, String lastName, double gpa) {
        FirstName = firstName;
        LastName = lastName;
        GPA = gpa;
    }

    // Getters
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}