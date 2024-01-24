import java.util.ArrayList;
import java.util.Arrays;

public class TraverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Hello", "Man", "wassup"));

        // Traverse the list using a for loop
        System.out.println("Using a for loop:");
        for (int i = 0; i < list.size(); i++) {
            // Get the element at index i
            String element = list.get(i);
            // Print the element
            System.out.println(element);
        }

        // Traverse the list using an enhanced for loop
        System.out.println("Using an enhanced for loop:");
        for (String element : list) {
            // Print the element
            System.out.println(element);
        }
    }
}
