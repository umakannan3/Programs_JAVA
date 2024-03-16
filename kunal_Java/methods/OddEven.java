package methods;

import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = s.nextInt();
        String ans = check(n);
        System.out.println(n + " is a " + ans + " Number");
    }

    static String check(int no){
        if(no%2 == 0){
            return "even";
        } else return "odd";
    }
}
