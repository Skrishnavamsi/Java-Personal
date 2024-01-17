public class ArrayRotation {

    // A helper method to rotate the array by one position to the left
    public static void rotateArrayByOne(int[] arr) {
        int temp = arr[0]; // store the first element
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // shift the rest of the elements
        }
        arr[arr.length - 1] = temp; // update the last element
    }

    // A method to rotate the array by x positions to the left
    public static void rotateL(int[] arr, int x) {
        // if x is negative or larger than the array length, adjust it
        x = x % arr.length;
        if (x < 0) {
            x = x + arr.length;
        }
        // rotate the array by one position x times
        for (int i = 0; i < x; i++) {
            rotateArrayByOne(arr);
        }
    }

    // A method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // A main method to test the program
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // change the array values here
        System.out.println("Original array:");
        printArray(arr);
        rotateL(arr, 2); // change the x value here
        System.out.println("Rotated array:");
        printArray(arr);
    }
}
