package sortingsearching;

public class BinarySearch {

    /**
     * Performs iterative binary search on a sorted array.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int search(int[] arr, int target) {
        if (arr == null)
            return -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents integer overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void demo() {
        System.out.println("\n--- Problem 16: Binary Search (Iterative) ---");
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));

        int t1 = 23;
        System.out.println("Target " + t1 + " found at index: " + search(arr, t1));

        int t2 = 50;
        System.out.println("Target " + t2 + " found at index: " + search(arr, t2));
    }
}
