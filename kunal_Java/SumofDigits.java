// Sum Of A Digits Of Number

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the digits : ");
        int n = s.nextInt();
        while(n!=0){
            int rem = n%10;
            sum = sum +rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}
