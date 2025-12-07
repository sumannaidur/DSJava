package strings;

public class RotationCheck {

    /**
     * Checks if two strings are rotations of each other.
     * Logic: If s1 and s2 are rotations, then s2 must be a substring of s1 + s1.
     * 
     * Time Complexity: O(n) - depends on substring implementation (usually KMP or
     * similar internally)
     * Space Complexity: O(n) - for concatenating s1 + s1
     * 
     * @param s1 First string
     * @param s2 Second string
     * @return true if s2 is a rotation of s1, false otherwise
     */
    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        // Lengths must be equal for them to be rotations
        if (s1.length() != s2.length()) {
            return false;
        }

        String combined = s1 + s1;

        return combined.contains(s2);
    }

    public static void demo() {
        System.out.println("\n--- Problem 13: Check String Rotation ---");

        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println("s1: \"" + s1 + "\", s2: \"" + s2 + "\" -> " + isRotation(s1, s2));

        String s3 = "abcd";
        String s4 = "acbd";
        System.out.println("s1: \"" + s3 + "\", s2: \"" + s4 + "\" -> " + isRotation(s3, s4));

        String s5 = "hello";
        String s6 = "lohel";
        System.out.println("s1: \"" + s5 + "\", s2: \"" + s6 + "\" -> " + isRotation(s5, s6));
    }
}
