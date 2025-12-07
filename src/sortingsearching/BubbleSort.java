package sortingsearching;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Sorts an array using Bubble Sort algorithm.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void demo() {
        System.out.println("\n--- Problem 19: Bubble Sort ---");
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original: " + Arrays.toString(arr));

        sort(arr);
        System.out.println("Sorted:   " + Arrays.toString(arr));
    }
}
