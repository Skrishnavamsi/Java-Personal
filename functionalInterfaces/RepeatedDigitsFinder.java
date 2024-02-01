package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class RepeatedDigitsFinder {
    public static void main(String[] args) {
        int inputNumber = 115233;
        findAndPrintRepeatedDigits(inputNumber);
    }

    public static void findAndPrintRepeatedDigits(int number) {
        String numberStr = Integer.toString(number);
        Map<Character, Integer> digitCounts = new HashMap<>();

        // Count the occurrence of each digit
        for (char digit : numberStr.toCharArray()) {
            digitCounts.put(digit, digitCounts.getOrDefault(digit, 0) + 1);
        }

        // Check for digits that are repeated more than once and print them
        System.out.print("Digits repeated more than once: ");
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : digitCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}

