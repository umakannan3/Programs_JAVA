// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the A : ");
        int a = sc.nextInt();
        System.out.print("Enter the B : ");
        int b = sc.nextInt();
        if(a<b){
            System.out.println(b +" is greater than  "+ a);
        } else{
            System.out.println(a +" is greater than  "+ b);
        }
    }
    
}
