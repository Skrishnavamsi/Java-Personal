public class Student {
    private final String name;
    public Student(String studentName) {
        this.name = studentName;
    }
    public String getName() {
        return this.name;
    }
    public static void main(String[] args) {
        Student student1 = new Student("krishnavamsi S");
        System.out.println("Student Name: " + student1.getName());
    }
}
