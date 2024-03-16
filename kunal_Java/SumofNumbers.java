// Write a program to print the sum of negative numbers, sum of positive even numbers and 
// the sum of positive odd numbers from a list of numbers (N) entered by the user. 
// The list terminates when the user enters a zero.

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the List Length (0 to stop) : ");
        int n = s.nextInt();
        int sumNegative = 0,sumPostiveOdd = 0 , sumPositiveEven = 0;
        for(int i=0; i<n; i++){
            int no = s.nextInt();
            if(no == 0){
                break;
            }
            if(no<0){
                sumNegative = sumNegative+no;
            }else if(no%2 == 0){
                sumPositiveEven = sumPositiveEven+no;
            }else{
                sumPostiveOdd = sumPostiveOdd+no;
            }
        }
        System.out.println("Sum Negative No : "+sumNegative);
        System.out.println("Sum positive Even No : "+sumPositiveEven);
        System.out.println("Sum Negative Odd No : "+sumPostiveOdd);
    }
}
