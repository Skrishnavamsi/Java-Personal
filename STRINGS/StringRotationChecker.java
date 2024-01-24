public class StringRotationChecker {

    public static boolean isRotation(String s1, String s2) {
        // Check if lengths are equal and not zero
        if (s1.length() == s2.length() && s1.length() > 0) {
            // Concatenate s1 with itself
            String s1s1 = s1 + s1;
            // Check if s2 is a substring of s1s1
            return s1s1.contains(s2);
        }
        return false;
    }

    public static void main(String[] args) {
        String input1 = "JavaJ2eeStrutsHibernate";
        String input2 = "StrutsHibernateJavaJ2ee";
        System.out.println(isRotation(input1, input2)); // Output should be true
    }
}
