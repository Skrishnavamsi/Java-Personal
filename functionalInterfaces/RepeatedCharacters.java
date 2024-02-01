package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Ignore case
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' - " + entry.getValue() + " times");
            }
        }
    }
}