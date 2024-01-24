import java.util.ArrayList;
import java.util.List;

public class RemoveLastElement {

    public static void main(String[] args) {
        // Create and populate an ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        // Display the original list
        System.out.println("Original ArrayList: " + stringList);

        // Remove the last element
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
        }

        // Display the list after removal
        System.out.println("ArrayList after removing last element: " + stringList);
    }
}
