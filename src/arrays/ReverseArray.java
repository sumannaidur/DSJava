package arrays;

import java.util.Arrays;

public class ReverseArray {

    /**
     * Reverses an array in-place using Two Pointers.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void reverse(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void demo() {
        System.out.println("\n--- Problem 9: Reverse Array (Two Pointers) ---");

        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println("Original: " + Arrays.toString(arr1));
        reverse(arr1);
        System.out.println("Reversed: " + Arrays.toString(arr1));

        int[] arr2 = { 10, 20, 30, 40 };
        System.out.println("Original: " + Arrays.toString(arr2));
        reverse(arr2);
        System.out.println("Reversed: " + Arrays.toString(arr2));
    }
}
