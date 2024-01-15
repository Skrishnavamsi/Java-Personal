public class Main {
    static int x=5;
    public static int getX() {
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Value of static variable: " + x);
        System.out.println("Value of static variable: " + getX());

        MyFinalClass obj2 = new MyFinalClass();
        obj2.myFinalMethod();

        ChildClass childObj1 = new ChildClass(10, 20);
        System.out.println("Parent variable: " + childObj1.parentVar + ", Child variable: " + childObj1.childVar);

        ChildClass childObj2 = new ChildClass(30);
        System.out.println("Parent variable (default): " + childObj2.parentVar + ", Child variable: " + childObj2.childVar);
    }
}
