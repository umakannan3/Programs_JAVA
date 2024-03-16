package methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = s.nextInt();
        String ans = palindrome(n);
        System.out.println(ans);
    }
    public static String palindrome(int n){
        int temp = n;
        int reverse = 0;
        while(n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n=n/10;
        }
        if(temp == reverse){
            return "Palindrome";
        }
        return "not a palindrome";
    }
}
