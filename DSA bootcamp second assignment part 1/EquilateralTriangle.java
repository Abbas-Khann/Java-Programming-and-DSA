// Find the area of an Equilateral Triangle

import java.util.Scanner;


import static java.lang.Math.sqrt;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a side ");
        float a = sc.nextFloat();
        System.out.print("Enter the b side ");
        float b = sc.nextFloat();
        System.out.print("Enter the c side ");
        float c = sc.nextFloat();
        double area;
        double Eq = (a + b + c) / 2;
        area = Math.sqrt(Eq *(Eq - a) * (Eq - b) * (Eq - c));
        System.out.print(area);
    }
}