package Lect5;

public class SumOfFirstNNumberWithoutParams {
    // Method to calculate the sum of the first n natural numbers recursively
    static int calculateSum(int n) {
        // Base case: if n is less than 1, return 0
        if (n < 1) {
            return 0;
        }
        // Recursive case: add the current number n to the sum of the previous numbers
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;  // The input number; the sum of the first 4 natural numbers (1 + 2 + 3 + 4) will be 10
        // Print the result of the calculateSum method
        System.out.println(calculateSum(n));
    }
}
