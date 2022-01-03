// Find the distance between two points

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the co-ordinates (x1,y1) ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter the co-ordinates (x2,y2) ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt((x2 - x1)*(x2 - x1) + ((y2 - y1)*(y2 - y1)));
        System.out.println(distance);
    }
}