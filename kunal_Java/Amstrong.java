// 9.  To find Armstrong Number between two given number.

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int number = sc.nextInt();
        int temp = number, checkNo = 0;
        while (temp > 0) {
            int reminder = temp % 10;
            int cubeNo = (int) Math.pow(reminder, 3);
            checkNo = checkNo + cubeNo;
            temp = temp / 10;
        }
        System.out.println(checkNo);
        if (checkNo == number)
            System.out.println(number + " is a Amstrong Number");
        else
            System.out.println(number + " is not a Amstrong Number");

    }
}
