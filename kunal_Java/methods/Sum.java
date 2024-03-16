package methods;

import java.util.Scanner;

// Write a program to print the sum of two numbers entered by user by defining your own method.

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Area of the Circle");
        System.out.println("4. Circumference of the Circle");
        System.out.print("Choose your option : ");
        int n = s.nextInt();

        switch (n) {
            case 1:
                System.out.print("Enter number1 : ");
                int num1 = s.nextInt();
                System.out.print("Enter number2 : ");
                int num2 = s.nextInt();
                int ans = sum(num1, num2, n);
                System.out.println("Sum of two nos : " + ans);
                break;
            case 2:
                System.out.print("Enter number1 : ");
                int num3 = s.nextInt();
                System.out.print("Enter number2 : ");
                int num4 = s.nextInt();
                int ans1 = sum(num3, num4, n);
                System.out.println("Product of two nos : " + ans1);
                break;
            case 3:
                System.out.print("Radius : ");
                double r = s.nextDouble();
                double ans2 = circle(r, n);
                System.out.println("Area of the Circle " + ans2);
                break;
            case 4:
                System.out.print("Radius : ");
                double r1 = s.nextDouble();
                double ans3 = circle(r1, n);
                System.out.println("Area of the Circle " + ans3);
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }

    }

    public static int sum(int a, int b, int choice) {
        if (choice == 1)
            return a + b;
        else
            return a * b;
    }

    public static double circle(double r, int no) {
        if (no == 3) {
            return Math.PI * Math.pow(r, 2);
        } else
            return 2 * Math.PI * r;
    }
}
