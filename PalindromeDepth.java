/**
 * This is the PalindromeDepth program
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-05-13
 */

public class PalindromeDepth {
    private PalindromeDepth() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    
    /**
     * This function calculates the palindrome depth of a number
     */
    public static int palindromeDepth(long integer, int currentDepth) {
        // Reverse the integer
        String integerStr = String.valueOf(integer);
        String reversedIntegerStr = new StringBuilder(integerStr).reverse().toString();
        long reversedInteger = Long.parseLong(reversedIntegerStr);

        // Check if integer is a palindrome
        if (integer == reversedInteger) {
            return currentDepth;
        } else {
            long sum = integer + reversedInteger;
            return palindromeDepth(sum, currentDepth + 1);
        }
    }

    public static void main(String[] args) {
        int startInt = 10;
        int finishInt = 99;

        for (int counter = startInt; counter <= finishInt; counter++) {
            int intDepth = palindromeDepth(counter, 0);
            System.out.println(counter + " is a depth " + intDepth + " palindrome.");
        }

        System.out.println("\nDone.");
    }
}
