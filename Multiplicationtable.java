import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int n = sc.nextInt();
        for(int i =1 ; i<=10;i++){
            System.out.println(n  + "X" +  i  + "=" +  (n*i));
        }
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
}
