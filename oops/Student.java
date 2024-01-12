public class Student {
    String name;
    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Krishnavamsi";
        String myName = obj.getName();
        System.out.println(myName);

        Product p = new Product();
        p.printType();

        Car c = new Car();
        c.printType();
    }
}