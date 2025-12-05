package arrays;

public class MissingNumber {

    /**
     * Finds the missing number in an array containing numbers from 1 to N.
     * Approach 1: Mathematical Formula
     * Sum of 1 to N = N * (N + 1) / 2
     * Missing Number = Expected Sum - Actual Sum
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Note: Can cause integer overflow for very large N.
     */
    public static int findMissingNumberSum(int[] arr, int n) {
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }

    /**
     * Finds the missing number using XOR.
     * Logic: a ^ a = 0 and a ^ 0 = a
     * XOR all numbers from 1 to N, and XOR all elements in the array.
     * The result will be the missing number.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Note: Prevents integer overflow.
     */
    public static int findMissingNumberXor(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;

        // XOR all numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            xor2 = xor2 ^ num;
        }

        return xor1 ^ xor2;
    }

    public static void demo() {
        System.out.println("\n--- Problem 7: Find Missing Number (1 to N) ---");

        // Example: N=5, Array has {1, 2, 4, 5} (Missing 3)
        int n1 = 5;
        int[] arr1 = { 1, 2, 4, 5 };

        System.out.println("Array: " + java.util.Arrays.toString(arr1) + ", N=" + n1);
        System.out.println("Missing (Sum Formula): " + findMissingNumberSum(arr1, n1));
        System.out.println("Missing (XOR Method):  " + findMissingNumberXor(arr1, n1));

        // Example: N=8, Missing 7
        int n2 = 8;
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 8 };
        System.out.println("Array: " + java.util.Arrays.toString(arr2) + ", N=" + n2);
        System.out.println("Missing (XOR Method):  " + findMissingNumberXor(arr2, n2));
    }
}
