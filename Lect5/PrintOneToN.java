package Lect5;


/*
            Sample Output:
                        1
                        2
                        3
                        4
*/




public class PrintOneToN {

    /**
     * This method prints numbers from i to n recursively.
     *
     * @param i The current number to be printed.
     * @param n The final number to be printed.
     */
    static void printNRecursively(int i, int n) {
        // Base condition: if i is greater than n, the recursion stops.
        if (i > n) {
            return;
        }

        // Print the current value of i.
        System.out.println(i);

        // Recursive call to print the next number up.
        printNRecursively(i + 1, n);
    }

    public static void main(String[] args) {
        // The final number up to which we want to print.
        int n = 4;

        // Initial call to the recursive method starting from 1.
        printNRecursively(1, n);
    }
}

