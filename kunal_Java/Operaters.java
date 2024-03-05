//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operaters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        double a = sc.nextDouble();
        System.out.print("Enter B : ");
        double b = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /) : ");
        char ch = sc.next().charAt(0);

        if (ch == '+') {
            double res = a + b;
            System.out.println(a + " " + ch + " " + b + "=" + " " + res);
        } else if (ch == '-') {
            double res = a - b;
            System.out.println(a + " " + ch + " " + b + "=" + " " + res);
        } else if (ch == '*') {
            double res = a * b;
            System.out.println(a + " " + ch + " " + b + "=" + " " + res);
        } else if (ch == '/') {
            if (b == 0) {
                System.out.println("Error : Divisible by zero is not allowed ");
            } else {
                double res = a / b;
                System.out.println(a + " " + ch + " " + b + "=" + " " + res);

            }
        } else {
            System.out.println("Invalid Operator");
        }
    }
}
