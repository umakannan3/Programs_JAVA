// 8.  To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int number = sc.nextInt();
        int temp = number;
        int reverseNumber = 0;
        while(temp >0){
            int reminder = temp%10;
            reverseNumber = reverseNumber*10 + reminder;
            temp = temp/10;
        }
        if(reverseNumber == number)
        System.out.println(number + " is a Palindrome");
        else
        System.out.println(number + " is not a Palindrome");
    }
}
