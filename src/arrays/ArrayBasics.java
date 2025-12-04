package arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void demo() {
        System.out.println("\n--- Array Basics ---");
        
        // Declaration and Initialization
        int[] numbers = {5, 2, 9, 1, 6};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted Array:   " + Arrays.toString(numbers));
        
        // Searching
        int key = 9;
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("Found " + key + " at index: " + index);
    }
}
