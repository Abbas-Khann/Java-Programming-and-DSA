// Find the area of a circle using Java

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area ");
        double area;
        double PI = 3.14;
        int radius = sc.nextInt(); // Taking input here
        area = PI * radius * radius;
        System.out.println("The area of the circle is "+ area);
    }
}
