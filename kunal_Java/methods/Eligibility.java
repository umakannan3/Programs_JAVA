package methods;

import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class Eligibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        String ans = checkAge(age);
        System.out.println(name + " you are " + ans + " for vote");
    }
    static String checkAge(int age){
        if(age>=18){
            return "Eligible";
        }else return "not Eligible";
    }
}
