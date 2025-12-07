package arrays;

import java.util.Arrays;

public class FirstOccurrence {

    /**
     * Finds the index of the first occurrence of a target number in an array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param arr    The input array
     * @param target The number to search for
     * @return The index of the first occurrence, or -1 if not found
     */
    public static int findFirstOccurrence(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void demo() {
        System.out.println("\n--- Problem 12: First Occurrence of a Number ---");

        int[] arr1 = { 2, 5, 3, 5, 7, 5 };
        int target1 = 5;
        System.out.println("Array: " + Arrays.toString(arr1) + ", Target: " + target1);
        System.out.println("First Occurrence Index: " + findFirstOccurrence(arr1, target1));

        int[] arr2 = { 1, 2, 3 };
        int target2 = 4;
        System.out.println("Array: " + Arrays.toString(arr2) + ", Target: " + target2);
        System.out.println("First Occurrence Index: " + findFirstOccurrence(arr2, target2));

        int[] arr3 = { 7, 7, 7 };
        int target3 = 7;
        System.out.println("Array: " + Arrays.toString(arr3) + ", Target: " + target3);
        System.out.println("First Occurrence Index: " + findFirstOccurrence(arr3, target3));
    }
}
