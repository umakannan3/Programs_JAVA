// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class UserInputLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 1 , n;
        System.out.println("Enter Integer (press 0 to stop) : ");
        while(true){
            n = sc.nextInt();
            if(n!=0){
                if(n>=max){
                    max =n;
                }
            }else
            break;
        }
        System.out.println("Maximum value is " + max);
    }
}
