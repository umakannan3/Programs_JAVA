// Calculate Discount Of Product

import java.util.Scanner;

public class DiscountCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of the Product : ");
        double amt = input.nextDouble();
        System.out.print("Discount of the Product : ");
        double dis = input.nextDouble();
        double discountAmount = dis/100*amt; 
        double finalAmount = amt - discountAmount;
        System.out.println("Final Rate of the product : "+finalAmount);
    }
}
