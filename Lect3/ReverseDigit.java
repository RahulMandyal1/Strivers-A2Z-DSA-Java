package Lect3;

public class ReverseDigit {
    public static void main(String [] args){
       int n = 5344;
       int revNumber=0;


       while(n >0){

        //Step first get  the last digit 

        int lastDigit= n %10;

        revNumber = (revNumber * 10 ) + lastDigit;

        //Step last trim the last digit 

        n = n/10;
       }

       System.out.print(revNumber + " this is the number in reversed ");
    }
}
