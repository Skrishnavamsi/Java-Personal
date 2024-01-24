import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String s1, String s2) {
        // Remove whitespaces and convert strings to lower case
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char array
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        // Sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("apple", "papel")); // true
    }
}
