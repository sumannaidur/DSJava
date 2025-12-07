package sortingsearching;

public class LinearSearch {

    /**
     * Performs linear search to find the index of a target element.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int search(int[] arr, int target) {
        if (arr == null)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void demo() {
        System.out.println("\n--- Problem 15: Linear Search ---");
        int[] arr = { 10, 50, 30, 70, 80, 20 };
        int target = 30;
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target " + target + " found at index: " + search(arr, target));

        int target2 = 99;
        System.out.println("Target " + target2 + " found at index: " + search(arr, target2));
    }
}
