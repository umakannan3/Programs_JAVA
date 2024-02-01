import java.util.Scanner;

public class Swap {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A : ");
    int a = sc.nextInt();
    System.out.print("Enter B : ");
    int b = sc.nextInt();
    int c = (a^b)^a;
    int d = (a^b)^b;
    System.out.println("A  : " +c);
    System.out.println("B  : " +d);
    System.out.println(Integer.toBinaryString(a));
    System.out.println(Integer.toBinaryString(b));
    System.out.println(Integer.toBinaryString(c));
    System.out.println(Integer.toBinaryString(d));
    System.out.print("Enter the Binary number : ");
    String l = sc.next();
    System.out.println(Integer.parseInt(l,2));


   } 
}
