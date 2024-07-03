
/**
 * This class prints a filled square pattern using asterisks.
 * 
 * Purpose: DSA preparation for understanding nested loops.
 * 
 * Example pattern for n = 2:
 * **
 * **
 * 
 * Reference: https://media.geeksforgeeks.org/wp-content/uploads/20230201105319/Pattern-Printing-in-Java.jpg 
 */

 public class  SquareFillPattern {


   /**
     * Prints a filled square pattern of size n x n.
     * @param n The size of the square (n x n)
    */
  public static void printpattern(int n) {
   // Outer loop to handle rows (0 to n-1)
        for (int i = 0; i < n; i++) {
            // Inner loop to handle columns (0 to n-1)
            for (int j = 0; j < n; j++) {
                // Print an asterisk for each position in the square
                System.out.print("*");
            }
            // Move to the next line after each row is complete
            System.out.println();
        }
  }

  public static void main(String[] args) {
    int n = 2;
    printpattern(n);
  }
}




