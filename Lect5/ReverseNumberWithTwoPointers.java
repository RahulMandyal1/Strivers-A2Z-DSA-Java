package Lect5;

public class ReverseNumberWithTwoPointers {

    // Function to print array
    static void printArray(int[] arr) {
        System.out.println("Reversed array is:- ");
        // Iterate through each element in the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a new line after the array
    }

    // Function to swap two elements in an array
    public static void swap(int[] arr, int index1, int index2) {
        // Store the value of the first element in a temporary variable
        int tmp = arr[index1];
        // Replace the first element with the second
        arr[index1] = arr[index2];
        // Replace the second element with the temporary variable (original first element)
        arr[index2] = tmp;
    }

    // Recursive function to reverse the array
    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: if start index is less than end index
        if (start < end) {
            // Swap the elements at start and end indices
            swap(arr, start, end);
            // Recursive call with updated indices
            reverseArray(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = { 5, 4, 3, 2, 1 };
        // Call reverseArray function with initial start and end indices
        reverseArray(arr, 0, arr.length - 1);
        // Print the reversed array
        printArray(arr);
    }
}