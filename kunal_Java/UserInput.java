// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 , n ;
        System.out.print("Enter Integers (enter 0 to stop) : ");
        while(true){
            n = sc.nextInt();
            if(n!=0){
                sum = sum + n;
            }else{
                break;
            }
            
        }
        System.out.println(sum);
    }
}
