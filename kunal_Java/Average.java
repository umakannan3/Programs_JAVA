// Calculate Average Of N Numbers

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the N : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter N["+(i+1)+"] : ");
            double num = s.nextDouble();
            sum+=num;
        }
        System.out.println(sum/n);
    }
}
