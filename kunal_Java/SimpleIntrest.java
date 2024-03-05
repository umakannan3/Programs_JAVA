// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("P : ");
        int p = sc.nextInt();
        System.out.print("P : ");
        float n = sc.nextFloat();
        System.out.print("P : ");
        float r = sc.nextFloat();
        double si = (p*n*r)/100;
        System.out.println("Simple Interest : " + si);
    }
}
