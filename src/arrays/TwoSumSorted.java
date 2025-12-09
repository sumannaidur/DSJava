package arrays;

import java.util.Arrays;

public class TwoSumSorted {

    /**
     * Finds two numbers in a sorted array that add up to a target.
     * Uses Two Pointers technique.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param arr    Sorted input array
     * @param target Target sum
     * @return An array containing indices (0-based) of the two numbers, or {-1, -1}
     *         if not found.
     */
    public static int[] findTwoSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return new int[] { -1, -1 };
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                return new int[] { left, right };
            } else if (currentSum < target) {
                left++; // Need a larger sum
            } else {
                right--; // Need a smaller sum
            }
        }

        return new int[] { -1, -1 };
    }

    public static void demo() {
        System.out.println("\n--- Problem 20: Two Sum (Sorted Array) ---");

        int[] arr1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = findTwoSum(arr1, target1);
        System.out.println("Array: " + Arrays.toString(arr1) + ", Target: " + target1);
        System.out.println("Indices: " + Arrays.toString(result1));

        int[] arr2 = { 1, 2, 4, 4 };
        int target2 = 8;
        int[] result2 = findTwoSum(arr2, target2);
        System.out.println("Array: " + Arrays.toString(arr2) + ", Target: " + target2);
        System.out.println("Indices: " + Arrays.toString(result2));

        int[] arr3 = { 1, 3, 4, 5 };
        int target3 = 10;
        int[] result3 = findTwoSum(arr3, target3);
        System.out.println("Array: " + Arrays.toString(arr3) + ", Target: " + target3);
        System.out.println("Indices: " + Arrays.toString(result3));
    }
}
