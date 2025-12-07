package arrays;

import java.util.Arrays;

public class MoveZeros {

    /**
     * Moves all zeros to the end of the array while maintaining the relative order
     * of non-zero elements.
     * Uses Two Pointers technique.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void moveZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int j = 0; // Pointer for the position of the next non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void demo() {
        System.out.println("\n--- Problem 10: Move Zeros to End (Two Pointers) ---");

        int[] arr1 = { 0, 1, 0, 3, 12 };
        System.out.println("Original: " + Arrays.toString(arr1));
        moveZeros(arr1);
        System.out.println("Modified: " + Arrays.toString(arr1));

        int[] arr2 = { 0, 0, 1 };
        System.out.println("Original: " + Arrays.toString(arr2));
        moveZeros(arr2);
        System.out.println("Modified: " + Arrays.toString(arr2));

        int[] arr3 = { 1, 2, 3 };
        System.out.println("Original: " + Arrays.toString(arr3));
        moveZeros(arr3);
        System.out.println("Modified: " + Arrays.toString(arr3));
    }
}
