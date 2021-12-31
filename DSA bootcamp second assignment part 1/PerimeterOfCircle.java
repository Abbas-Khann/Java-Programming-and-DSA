// Perimeter of a Circle

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius ");
        float radius = sc.nextFloat();
        double PI = 3.14;
        Double Perimeter;
        Perimeter = 2 * PI * radius;
        System.out.println(Perimeter);
    }

}
