package arrays;

public class CheckSorted {

    /**
     * Checks if an array is sorted in ascending order.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void demo() {
        System.out.println("\n--- Problem 17: Check Array is Sorted ---");
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(java.util.Arrays.toString(arr1) + " is sorted? " + isSorted(arr1));

        int[] arr2 = { 1, 2, 5, 3, 4 };
        System.out.println(java.util.Arrays.toString(arr2) + " is sorted? " + isSorted(arr2));
    }
}
