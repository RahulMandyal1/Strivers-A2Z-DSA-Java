
/**
 *  https://media.geeksforgeeks.org/wp-content/uploads/20230201105319/Pattern-Printing-in-Java.jpg 
 */

public class SqaureHollowPattern {
  public static void printPattern(int n) {
    int i, j;

      // Outer loop for rows (0 to n, inclusive)
    for (i = 0; i <= n; i++) {
     // Inner loop for columns (0 to n, inclusive)
      for (j = 0; j <= n; j++) {
         // Check if current position is on the border of the square
        if(i==0 || j==0 ||j==n || i==n){
              System.out.print("*");
        }
          // If not on border, print space (for hollow effect)
        else{
                  System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 3;
    printPattern(n);
  }
}
