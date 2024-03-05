// Input currency in rupees and output in USD

import java.util.Scanner;

public class Dollerconvertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in Rs : ");
        double amt = sc.nextDouble();
        double dollar = amt/80;
        System.out.println("Rs : " + amt + " is equalent to " + dollar + "Dollars");
    }    
}
