package arrays;

public class SecondLargestElement {

    /**
     * Finds the second largest element in an integer array using a single pass.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Returns Integer.MIN_VALUE if no second largest element exists.
     */
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be equal).");
        }

        return secondLargest;
    }

    public static void demo() {
        System.out.println("\n--- Problem 4: Second Largest Element in Array ---");

        int[] arr1 = { 12, 35, 1, 10, 34, 1 };
        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        System.out.println("Second Largest: " + findSecondLargest(arr1));

        int[] arr2 = { 10, 5, 10 };
        System.out.println("Array: " + java.util.Arrays.toString(arr2));
        System.out.println("Second Largest: " + findSecondLargest(arr2));

        int[] arr3 = { 10, 10, 10 };
        System.out.println("Array: " + java.util.Arrays.toString(arr3));
        System.out.println("Second Largest: " + findSecondLargest(arr3));
    }
}
