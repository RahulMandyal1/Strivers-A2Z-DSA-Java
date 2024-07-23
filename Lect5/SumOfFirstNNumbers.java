package Lect5;

/**
 * SumOfFirstNNumbers
 * This class calculates the sum of first n natural numbers using recursion.
 */
public class SumOfFirstNNumbers {

    /**
     * Recursive method to calculate the sum of first n natural numbers
     * @param n The number up to which we want to calculate the sum
     * @param sum The running sum (accumulator)
     */
     static void calculateSum(int n, int sum) {
        // Base case: if n is less than 1, we've summed all numbers
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        // Recursive case: add n to sum and call the method with n-1
        calculateSum(n - 1, sum + n);
     }

    public static void main(String[] args) {
        int n = 4; // We want to calculate the sum of first 4 natural numbers: 4+3+2+1 = 10 
        
        // Call the recursive method with initial sum as 0
        calculateSum(n, 0);
    }
}