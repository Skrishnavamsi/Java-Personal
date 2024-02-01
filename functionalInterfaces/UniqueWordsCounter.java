package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String text = "This is a test text with some test words and some unique words";
        System.out.println("Number of unique words: " + countUniqueWords(text));
    }

    public static int countUniqueWords(String text) {
        // Split the text into words using space as delimiter
        String[] words = text.split("\\s+");
        // Create a HashMap to store unique words and their counts
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            // Convert words to lowercase to ensure case-insensitive comparison
            String wordInLowerCase = word.toLowerCase();
            // Update the count for each word
            wordCounts.put(wordInLowerCase, wordCounts.getOrDefault(wordInLowerCase, 0) + 1);
        }

        // The size of the HashMap represents the number of unique words
        return wordCounts.size();
    }
}

