package Lect5;

// Tree Recursive diagram here 
// https://static.takeuforward.org/wp/uploads/2023/02/image.png

public class PrintNRecursively {

    /**
     * This method prints numbers from i down to 1 recursively.
     *
     * @param i The current number to be printed.
     * @param n The original number passed (not used in this implementation but kept for consistency).
     */
    public static void printNRecursively(int i, int n) {
        // Base Condition: if i is less than 1, the recursion stops.
        if (i < 1) return;

        // Print the current value of i.
        System.out.println(i);

        // Recursive call to print the next number down.
        printNRecursively(i - 1, n);
    }

    public static void main(String[] args) {
        // Number to start printing from.
        int n = 4;

        // Initial call to the recursive method with the starting number n.
        printNRecursively(n, n);
    }
}
