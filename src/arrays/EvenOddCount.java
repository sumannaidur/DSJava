package arrays;

import java.util.Arrays;

public class EvenOddCount {

    /**
     * Counts the number of even and odd integers in an array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void countEvenOdd(int[] arr) {
        if (arr == null) {
            System.out.println("Array is null.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Even = " + evenCount + ", Odd = " + oddCount);
    }

    public static void demo() {
        System.out.println("\n--- Problem 11: Count Even and Odd Numbers ---");

        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        countEvenOdd(arr1);

        int[] arr2 = { 2, 4, 6, 8 };
        countEvenOdd(arr2);

        int[] arr3 = { 1, 3, 5, 7, 9 };
        countEvenOdd(arr3);
    }
}
