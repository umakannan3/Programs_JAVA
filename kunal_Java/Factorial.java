// Factorial Program In Java

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
    int i = 1 , prod = 1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = sc.nextInt();
    while(i<=n){
        prod *=i;
        i++;
    }
    System.out.println(n+"! = " + prod);
   } 
}
