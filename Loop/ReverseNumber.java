public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseDigits(number);
        System.out.println("Reversed Number: " + reversed);
    }

    public static int reverseDigits(int number) {

        String numStr = Integer.toString(number);


        String reversedStr = new StringBuilder(numStr).reverse().toString();

        return Integer.parseInt(reversedStr);
    }
}
