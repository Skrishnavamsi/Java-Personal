package Maps;

import java.util.HashMap;
import java.util.Map;

class StudentDirectory {
    private final Map<String, Student3> studentMap;

    public StudentDirectory() {
        studentMap = new HashMap<>();
        // Initialize with  students
        studentMap.put("John", new Student3("John", "Doe", 3.5));
        studentMap.put("Jane", new Student3("Jane", "Doe", 3.6));

    }

    public Student3 getStudentByName(String firstName) {
        return studentMap.get(firstName);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();
        Student3 student = directory.getStudentByName("John");
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found");
        }
    }
}