package Lect5;

public class ReversedNumberWithOnePointer {
    

    // Function to print array
    static void printArray(int[] arr) {
        System.out.println("Reversed array is:- ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }




     // Function to swap two elements in an array
    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void reverseArray(int[] arr, int i) {
        if (i < arr.length/2) {
            swap(arr, i , arr.length-i -1);
            reverseArray(arr, i+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        reverseArray(arr, 0);
        printArray(arr);
    }



}
