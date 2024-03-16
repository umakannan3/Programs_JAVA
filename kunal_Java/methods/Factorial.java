package methods;

import java.util.Scanner;

// Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = s.nextInt();
        int value = Factorial(n);
        System.out.println("Answer : " + value);
    }
    public static int Factorial(int number){
        int product = 1;
        if(number<0){
            System.out.println("Enter Valid no");
        }else if(number == 0 || number==1){
            return 1;
        }else{
            while(number>0){
                product = product*number;
                number--;
            }
        }
        return product;
    }
}
