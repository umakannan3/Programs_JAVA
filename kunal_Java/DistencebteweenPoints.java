// Calculate Distance Between Two Points

import java.util.Scanner;

public class DistencebteweenPoints {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the POINTS :");
        System.out.print("x1 : ");
        double x1 = s.nextDouble();
        System.out.print("y1 : ");
        double y1 = s.nextDouble();
        System.out.print("x2 : ");
        double x2 = s.nextDouble();
        System.out.print("y2 : ");
        double y2 = s.nextDouble();
        double distance = distanceCalculation(x1,y1,x2,y2);
        System.out.println("Answer is : " +distance);
    }
    public static double distanceCalculation(double x1,double y1,double x2,double y2){
        double ans = Math.sqrt(Math.pow((x2-x1) , 2) + Math.pow((y2-y1) , 2));
        return ans;
    }
}
