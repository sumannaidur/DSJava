package strings;

public class RemoveWhitespace {

    /**
     * Removes all whitespaces from a given string.
     * Uses StringBuilder to construct the result efficiently.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * @param str Input string
     * @return String without whitespaces
     */
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    /**
     * Alternative using Regex (one-liner).
     */
    public static String removeWhitespaceRegex(String str) {
        if (str == null)
            return null;
        return str.replaceAll("\\s+", "");
    }

    public static void demo() {
        System.out.println("\n--- Problem 14: Remove Whitespaces from String ---");

        String s1 = " a p p l e ";
        System.out.println("Original: '" + s1 + "'");
        System.out.println("Result:   '" + removeWhitespace(s1) + "'");

        String s2 = "Java   Programming   ";
        System.out.println("Original: '" + s2 + "'");
        System.out.println("Result:   '" + removeWhitespace(s2) + "'");
    }
}
