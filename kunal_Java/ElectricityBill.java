// Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        double totalAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your consumed unit : "); 
        int n = sc.nextInt();
        if(n<=100){
            totalAmount = n*2.25;
        }else if(n<=200){
            totalAmount = 100*2.25+(n-100)*3.25;
        }else if(n<=300){
            totalAmount = 100*2.25+100*3.25+(n-200)*4.25;
        }else if(n<=400){
            totalAmount = 100*2.25+100*3.25+100*4.25+(n-300)*5.25;
        }else if(n<=500){
            totalAmount = 100*2.25+100*3.25+100*4.25+100*5.25+(n-400)*6.25;
        }
        System.out.println(totalAmount);
    }
}
