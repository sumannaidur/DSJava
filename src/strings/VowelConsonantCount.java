package strings;

public class VowelConsonantCount {

    /**
     * Counts vowels and consonants in a string.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void countVowelsAndConsonants(String str) {
        if (str == null) {
            System.out.println("String is null.");
            return;
        }

        int vowels = 0;
        int consonants = 0;
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("String: \"" + str + "\"");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void demo() {
        System.out.println("\n--- Problem 6: Count Vowels and Consonants ---");

        countVowelsAndConsonants("Hello World");
        System.out.println();
        countVowelsAndConsonants("Java Programming");
        System.out.println();
        countVowelsAndConsonants("AEIOU");
    }
}
