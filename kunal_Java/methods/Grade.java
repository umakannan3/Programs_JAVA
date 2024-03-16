package methods;

import java.util.Scanner;

// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
 
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

public class Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = s.nextInt();
        String grade = grade(marks);
        System.out.println("Grade : " + grade);
    }
    static String grade(int m){
        if(m<0 || m>100){
            return "Enter Valid Marks";
        }
        if(m<=100 && m >=91 ) {
            return "AA";
        }else if(m<=90 && m >=81 ) {
            return "AB";
        }else if(m<=80 && m >=71 ) {
            return "BB";
        }else if(m<=70 && m >=61 ) {
            return "BC";
        }else if(m<=60 && m >=51 ) {
            return "CD";
        }else if(m<=50 && m >=41 ) {
            return "DD";
        }
        return "FAIL";
    }
}
