package sortingsearching;

public class FindFloor {

    /**
     * Finds the floor of a target number in a sorted array.
     * Floor is the largest number <= target.
     * Uses modified Binary Search.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int findFloor(int[] arr, int target) {
        if (arr == null || arr.length == 0)
            return -1;

        int low = 0;
        int high = arr.length - 1;
        int floor = -1; // Default if no floor found (e.g., target < smallest element)

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // Target itself is the floor
            } else if (arr[mid] < target) {
                floor = arr[mid]; // Candidate for floor
                low = mid + 1; // Look for larger value <= target
            } else {
                high = mid - 1; // Value too large
            }
        }

        return floor;
    }

    public static void demo() {
        System.out.println("\n--- Problem 18: Find Floor of a Target ---");
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));

        int t1 = 6;
        System.out.println("Floor of " + t1 + " is: " + findFloor(arr, t1));

        int t2 = 12;
        System.out.println("Floor of " + t2 + " is: " + findFloor(arr, t2));

        int t3 = 0;
        System.out.println("Floor of " + t3 + " is: " + findFloor(arr, t3));
    }
}
