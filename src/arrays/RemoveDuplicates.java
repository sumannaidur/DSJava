package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted array in-place.
     * Uses the Two Pointers technique (Compression).
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param arr The sorted input array
     * @return The new length of the array with unique elements
     */
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int i = 0; // Pointer for the last unique element

        for (int j = 1; j < arr.length; j++) {
            // If current element is different from the last unique element
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // Move unique element to the next position
            }
        }

        return i + 1; // Length is index + 1
    }

    public static void demo() {
        System.out.println("\n--- Problem 8: Remove Duplicates from Sorted Array ---");

        int[] arr1 = { 1, 1, 2 };
        System.out.println("Original Array: " + Arrays.toString(arr1));
        int len1 = removeDuplicates(arr1);
        System.out.print("Modified Array (first " + len1 + " elements): [");
        for (int k = 0; k < len1; k++) {
            System.out.print(arr1[k] + (k < len1 - 1 ? ", " : ""));
        }
        System.out.println("]");

        int[] arr2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("Original Array: " + Arrays.toString(arr2));
        int len2 = removeDuplicates(arr2);
        System.out.print("Modified Array (first " + len2 + " elements): [");
        for (int k = 0; k < len2; k++) {
            System.out.print(arr2[k] + (k < len2 - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
