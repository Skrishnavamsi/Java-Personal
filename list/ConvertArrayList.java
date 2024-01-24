import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));

        // Convert the ArrayList to an Array
        // using the toArray(T[] a) method
        // passing an empty array of the same type and size as the list
        String[] array = list.toArray(new String[list.size()]);

        // Print the array
        System.out.println(Arrays.toString(array));
    }
}
