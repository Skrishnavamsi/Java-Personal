public class ReverseWords {

    public static void main(String[] args) {
        String input = "Java J2EE Reverse Me";
        String output = reverseEachWord(input);
        System.out.println(output);
    }

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");  // Split the sentence into words
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();  // Reverse the current word
            reversedSentence.append(reverseWord).append(" ");  // Append the reversed word to the result
        }

        return reversedSentence.toString().trim();  // Trim to remove the last space
    }
}
