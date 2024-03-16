package methods;

import java.util.Scanner;

// Define a method to find out if a number is prime or not.

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = s.nextInt();
        String ans = prime(n);
        System.out.println(ans);
    }    
    public static String prime(int no){
        int c =2;
        if(no<=0){
            return "Enter Positive integer";
        }else if(no == 1){
            return "1 is neither Prime nor Non-Prime";
        }else{
            while(Math.pow(c , 2) <= no){
                if(no%c == 0){
                    return "false";
                }
                c++;
            }
        }
        return "true";
    }
}
