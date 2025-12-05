package strings;

import java.util.Arrays;

public class AnagramCheck {

    /**
     * Checks if two strings are anagrams using a frequency array.
     * Time Complexity: O(n)
     * Space Complexity: O(1) (assuming fixed character set size, e.g., 26 for
     * lowercase English)
     */
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        // Using a frequency array for lowercase English letters
        int[] frequency = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // Increment for s1, decrement for s2
            // Assuming input is lowercase English letters.
            // For full ASCII/Unicode, use size 256 or a HashMap.
            frequency[c1 - 'a']++;
            frequency[c2 - 'a']--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void demo() {
        System.out.println("\n--- Problem 5: Check Anagrams (Frequency Array) ---");

        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + isAnagram(s1, s2));

        String s3 = "hello";
        String s4 = "world";
        System.out.println("Are '" + s3 + "' and '" + s4 + "' anagrams? " + isAnagram(s3, s4));

        String s5 = "anagram";
        String s6 = "nagaram";
        System.out.println("Are '" + s5 + "' and '" + s6 + "' anagrams? " + isAnagram(s5, s6));
    }
}
