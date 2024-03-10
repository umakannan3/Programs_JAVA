// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        // while (count <= n) {
        // System.out.print( a + ' ');
        // a = b;
        // b = a+b;
        // count++;
        // }

        while (count<=n) {
            // System.out.print(a);
            int c = a+b;
            a = b;
            b = c;
            count++;
            // a = b;
            // b = a + b;
            // System.out.print(" ");
        }
        System.out.print(b);
        

    }
}
