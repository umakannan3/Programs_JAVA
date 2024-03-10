// Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Finding Area Of Circle");
        System.out.println("2. Finding Perimeter Of Circle");
        System.out.println("3. FindingTotal Surface Area Of Cube");
        System.out.println("4. Finding Curved Surface Area Of Cylinder");
        System.out.println("5. Finding Volume Of Pyramid");
        System.out.println("6. Finding Volume Of Sphere");
        System.out.println("7. Finding Volume Of Cylinder");
        System.out.println("8. Finding Volume Of Prism");
        System.out.println("9. Finding Volume Of Cone");
        System.out.println("10. Finding Perimeter Of Rhombus");

        System.out.print("Enter your Choice : ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("1. Finding Area Of Circle");
                System.out.print("Enter the Radius of the Circle : ");
                double radius = sc.nextDouble();
                System.out.println("Area of the Circle : " + findAreaOfCircle(radius));
                break;
            case 2:
                System.out.println("2. Finding Perimeter Of Circle");
                System.out.print("Enter the Radius of the Circle : ");
                double radius1 = sc.nextDouble();
                System.out.println("Perimeter of the Circle : " + findPerimeterofCircle(radius1));
                break;
            case 3:
                System.out.println("2. Finding Total Surface Area Of Cube");
                System.out.print("Enter the Side of the Cube : ");
                double side = sc.nextDouble();
                System.out.println("Total Surface of Cube : " + findTotalSurfaceofCube(side));
                break;
            case 4:
                System.out.println("2. Finding Curved Surface Area Of Cylinder");
                System.out.print("Enter the radius : ");
                double radius2 = sc.nextDouble();
                System.out.print("Enter the height : ");
                double height = sc.nextDouble();
                System.out.println("Curved Surface Area Of Cylinder : " + CurvedSurfaceAreaOfCylinder(radius2, height));
                break;
            case 5:
                System.out.println("2. Finding Volume Of Pyramid");
                System.out.print("Enter the Base : ");
                double base = sc.nextDouble();
                System.out.print("Enter the height : ");
                double height1 = sc.nextDouble();
                System.out.println("Volume Of Pyramid : " + VolumeOfPyramid(base, height1));
                break;
            case 6:
                System.out.println("2. Finding Volume Of Sphere");
                System.out.print("Enter the radius : ");
                double radius3 = sc.nextDouble();
                System.out.println("Volume Of Sphere : " + VolumeOfSphere(radius3));
                break;
            case 7:
                System.out.println("2. Finding Volume Of Cylinder");
                System.out.print("Enter the radius : ");
                double radius4 = sc.nextDouble();
                System.out.print("Enter the height : ");
                double height2 = sc.nextDouble();
                System.out.println("Volume Of Cylinder : " + VolumeOfCylinder(radius4, height2));
                break;
            case 8:
                System.out.println("2. Finding Volume Of Pyramid");
                System.out.print("Enter the Base : ");
                double base1 = sc.nextDouble();
                System.out.print("Enter the height : ");
                double height3 = sc.nextDouble();
                System.out.println("Area of the Circle : " + VolumeOfPyramid(base1, height3));
                break;
            case 9:
                System.out.println("2. Finding Volume Of Cone");
                System.out.print("Enter the radius : ");
                double radius5 = sc.nextDouble();
                System.out.print("Enter the height : ");
                double height4 = sc.nextDouble();
                System.out.println("Volume Of Cone : " + VolumeOfCone(radius5, height4));
                break;
            case 10:
                System.out.println("2. Finding Perimeter Of Rhombus ");
                System.out.print("Enter the Side of the Cone : ");
                double side1 = sc.nextDouble();
                System.out.println("Perimeter Of Rhombus  : " + findPerimeterofRombus(side1));
                break;
            default:
                System.out.println("Enter the valid input!!!");
        }
    }

    public static double findAreaOfCircle(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    public static double findPerimeterofCircle(double r) {
        double perimeter = Math.PI * 2 * r;
        return perimeter;
    }

    public static double findTotalSurfaceofCube(double s) {
        double t_surface = 6 * Math.pow(s, 2);
        return t_surface;
    }

    public static double CurvedSurfaceAreaOfCylinder(double r, double h) {
        double curved_surface = 2 * Math.PI * r * h;
        return curved_surface;
    }

    public static double VolumeOfPyramid(double b, double h) {
        double volume = (1 / 3) * b * h;
        return volume;
    }

    public static double VolumeOfSphere(double r) {
        double volume = (4 / 3) * Math.PI * Math.pow(r, 3);
        return volume;
    }

    public static double VolumeOfCylinder(double r, double h) {
        double volume = Math.PI * Math.pow(r, 2) * h;
        return volume;
    }

    public static double VolumeOfCone(double r, double h) {
        double volume = Math.PI * Math.pow(r, 2) * (h / 3);
        return volume;
    }

    public static double findPerimeterofRombus(double s) {
        double perimeter = 4*s;
        return perimeter;
    }
}
