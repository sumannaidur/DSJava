package strings;

public class PalindromeCheck {

    /**
     * Checks if a string is a palindrome using Two Pointers.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void demo() {
        System.out.println("\n--- Problem 3: Check Palindrome (Two Pointers) ---");

        String[] testCases = { "madam", "racecar", "hello", "12321", "Java" };

        for (String s : testCases) {
            System.out.println("Is \"" + s + "\" a palindrome? " + isPalindrome(s));
        }
    }
}
