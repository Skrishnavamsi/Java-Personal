package Maps;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharactersCounter {

    public static void main(String[] args) {
        String input = "test string";
        printDistinctCharactersCount(input);
    }

    public static void printDistinctCharactersCount(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Counting each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Printing characters and their count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

