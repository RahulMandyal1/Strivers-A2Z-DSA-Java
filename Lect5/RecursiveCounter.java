
package Lect5;
// Tree Recursive diagram for reference can be found here:
// https://static.takeuforward.org/wp/uploads/2023/02/image-5.png

/**
 * RecursiveCounter
 *
 * This class demonstrates a simple use of recursion to print numbers 
 * from 0 to a specified limit (in this case, 3). The method `printN` 
 * will print the current value of the static counter variable and then 
 * call itself recursively, incrementing the counter each time, until 
 * the counter reaches the limit of 3.
 */


public class RecursiveCounter {
    static int counter =0 ;


     /**
     * This method prints the current value of the counter and then calls
     * itself recursively, incrementing the counter each time, until the 
     * counter reaches the value of 3.
     */



    static void printN( ){
        if(counter==3){
            return ;
        }
        System.out.println(counter);
        counter +=1;
        printN();
    }

    public static void main(String[] args) {
      printN();
    }
}




