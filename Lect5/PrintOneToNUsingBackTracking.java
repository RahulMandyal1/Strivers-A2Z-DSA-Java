package Lect5;

public class PrintOneToNUsingBackTracking {

    // Method to print numbers from 1 to i using backtracking
    static void print(int i, int j){
        // Base condition: if i is less than 1, return from the function
        if(i < 1){
            return;
        }

        // Recursive call to print the numbers from 1 to i-1 first
        // Logic is until the recursion call is not done, it will not execute the below print statement
        print(i - 1, j);

        // Backtracking step: print the current value of i after the recursive call completes
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 4;
        // Calling the print function with the value of n
        print(n, n);
    }
}
