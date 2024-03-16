package methods;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a = s.nextInt();
        System.out.print("Enter the second no: ");
        int b = s.nextInt();
        System.out.print("Enter the final no: ");
        int c = s.nextInt();
        int maximum = findMax(a, b, c);
        int minimum = findMin(a, b, c);
        System.out.println("Mininum Value : " + minimum);
        System.out.println("Maximum Value : " + maximum);
    }

    static int findMax(int p, int q, int r) {
        int max = p;
        if (q > p) {
            max = q;
        }
        if (r > max) {
            max = r;
        }
        return max;
    }

    static int findMin(int p, int q, int r) {
        int min = p;
        if (q < min) {
            min = q;
        }
        if (min > r) {
            min = r;
        }
        return min;
    }
}
