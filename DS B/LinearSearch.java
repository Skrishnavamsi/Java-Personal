public static int linearSearch(int[] arr, int x) {
    // Loop through the array from the beginning
    for (int i = 0; i < arr.length; i++) {
        // If the current element is equal to x, return the index
        if (arr[i] == x) {
            return i;
        }
    }
    // If x is not found, return -1
    return -1;
}

// A sample main method to test the linear search method
public static void main(String[] args) {
    // An example array of integers
    int[] arr = {5, 8, 3, 9, 2, 7};
    // An example element to search
    int x = 9;
    // Call the linear search method and print the result
    int index = linearSearch(arr, x);
    if (index == -1) {
        System.out.println(x + " is not present in the array");
    } else {
        System.out.println(x + " is present at index " + index);
    }
}
