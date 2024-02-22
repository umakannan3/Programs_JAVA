import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A : ");
        double a = sc.nextDouble();
        System.out.print("B : ");
        double b = sc.nextDouble();
        System.out.print("C : ");
        double c = sc.nextDouble();

        double res = b * b - 4.0 * a * c;
        if (res > 0.0) {
            double a1 = (-b + Math.pow(res, 0.5))/2.0*a;
            double a2 = (-b - Math.pow(res, 0.5))/2.0*a;
            System.out.println("The Roots are : " + a1 +"and"+a2);
        } else if(res == 0.0){
            double a3 = -b / 2.0*a;
            System.out.println("The Roots is : " + a3);
        }else {
            System.out.println("The Equation has no real roots");
        }
    }
}
