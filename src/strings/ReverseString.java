package strings;

public class ReverseString {

    /**
     * Reverses a string using the Two Pointers technique.
     * Time Complexity: O(n)
     * Space Complexity: O(n) (for converting to char array)
     */
    public static String reverse(String str) {
        if (str == null)
            return null;

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void demo() {
        System.out.println("\n--- Problem 2: Reverse a String (Two Pointers) ---");

        String s1 = "hello";
        System.out.println("Original: " + s1);
        System.out.println("Reversed: " + reverse(s1));

        String s2 = "Java DSA";
        System.out.println("Original: " + s2);
        System.out.println("Reversed: " + reverse(s2));

        String s3 = "Racecar";
        System.out.println("Original: " + s3);
        System.out.println("Reversed: " + reverse(s3));
    }
}
