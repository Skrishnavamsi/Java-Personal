public class Age {
    public static void main(String[] args) {

        printAgeCategory(10);
        printAgeCategory(15);
        printAgeCategory(25);
    }

    public static void printAgeCategory(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
