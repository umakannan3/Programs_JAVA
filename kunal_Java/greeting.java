//2 . Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class greeting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.next();
        System.out.println("Hay! " + name + "  Good Morning");
        sc.close();
    }
}
