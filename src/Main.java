import arrays.ArrayBasics;
import arrays.LargestElement;
import arrays.SecondLargestElement;
import arrays.MissingNumber;
import strings.ReverseString;
import strings.PalindromeCheck;
import strings.AnagramCheck;
import strings.VowelConsonantCount;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("   Java DSA Repository     ");
        System.out.println("===========================");

        // Run Array Demo
        ArrayBasics.demo();

        // Problem 1
        LargestElement.demo();

        // Problem 2
        ReverseString.demo();

        // Problem 3
        PalindromeCheck.demo();

        // Problem 4
        SecondLargestElement.demo();

        // Problem 5
        AnagramCheck.demo();

        // Problem 6
        VowelConsonantCount.demo();

        // Problem 7
        MissingNumber.demo();

        System.out.println("\nDone.");
    }
}
