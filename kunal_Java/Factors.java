// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int rem = n%i;
            if(rem ==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
