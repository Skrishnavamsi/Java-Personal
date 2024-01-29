package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("String1");
        stringSet.add("String2");
        stringSet.add("String3");
        stringSet.add("String4");
        stringSet.add("String5");
        stringSet.add("String6");
        stringSet.add("String7");
        stringSet.add("String8");
        stringSet.add("String9");
        stringSet.add("String10");

        // Iterate using Iterator
        System.out.println("Iteration using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate using standard for loop (not applicable for HashSet)
        // Convert HashSet to ArrayList
        ArrayList<String> stringList = new ArrayList<>(stringSet);

        // Iterate using standard for loop
        System.out.println("\nIteration using standard for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Iterate using enhanced for loop
        System.out.println("\nIteration using enhanced for loop:");
        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}

