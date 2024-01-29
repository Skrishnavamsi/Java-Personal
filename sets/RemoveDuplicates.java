package sets;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String inputString = "Hi How are you ?"; // Replace with your input string
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + removeDuplicates(inputString));
    }

    private static String removeDuplicates(String str) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!charSet.contains(c)) {
                charSet.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

