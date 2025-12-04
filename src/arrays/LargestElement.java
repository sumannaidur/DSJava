package arrays;

public class LargestElement {

    /**
     * Finds the largest element in an integer array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void demo() {
        System.out.println("\n--- Problem 1: Largest Element in Array ---");

        int[] arr1 = { 10, 5, 20, 8, 15 };
        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        System.out.println("Largest Element: " + findLargest(arr1));

        int[] arr2 = { -1, -5, -2, -8 };
        System.out.println("Array: " + java.util.Arrays.toString(arr2));
        System.out.println("Largest Element: " + findLargest(arr2));
    }
}
