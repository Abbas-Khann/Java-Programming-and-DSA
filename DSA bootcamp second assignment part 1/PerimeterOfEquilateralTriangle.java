// Finding the Perimeter of an Equilateral Triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a traingle ");
        Double side = sc.nextDouble();
        Double Perimeter = 3 * side;
        System.out.println(Perimeter);
    }
}
