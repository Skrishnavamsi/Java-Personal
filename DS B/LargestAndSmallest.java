public class LargestAndSmallest {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {34, 19, 78, 56, 89, 24, 5, 66};

        // Calling the method to find largest and smallest numbers
        LargestAndSmallest(numbers);
    }

    public static void LargestAndSmallest(int[] array) {
        // Initializing largest and smallest with the first element of the array
        int largest = array[0];
        int smallest = array[0];

        // Loop through the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the results
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }
}
