package threads;

//Create a Java class to represent a singleton pattern.

//The class should have a private constructor, and a public static method to get the instance of the class.

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}