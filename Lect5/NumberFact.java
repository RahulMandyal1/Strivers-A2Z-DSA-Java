package Lect5;

/**
 * NumberFact
 * This class calculates the factorial of a given number using recursion.
 */
public class NumberFact {

    /**
     * Recursive method to calculate the factorial of a number
     * @param n The number for which factorial is to be calculated
     * @return The factorial of n
     */
    static int findFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }

        // Recursive case: n * factorial of (n-1)
        return n * findFactorial(n-1);
    }

    public static void main(String[] args) {
        int num = 4; // Number for which factorial is to be calculated
        // Call the recursive method and print the result
        System.out.println(findFactorial(num));
    }
}