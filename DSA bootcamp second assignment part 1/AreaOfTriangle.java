// Find the area of a Triangle

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base ");
        double base = sc.nextDouble();              // Taking the input of base
        System.out.print("Enter the height ");
        int height = sc.nextInt();                 // Taking input of the height
        double area = height * base /2;           // The formula of finding the area of a traingle
        System.out.println(area);
    }
}
