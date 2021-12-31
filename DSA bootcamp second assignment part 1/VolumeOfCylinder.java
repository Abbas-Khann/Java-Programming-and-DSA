// Finding the Volume of a Cylinder

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius ");
        int radius = sc.nextInt();
        System.out.print("Enter the height ");
        int height = sc.nextInt();
        double volume = 3.14 * radius * radius * height;
        System.out.println(volume);
    }
}
