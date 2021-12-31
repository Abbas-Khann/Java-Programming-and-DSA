// Finding the Volume of Cone

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius ");
        int radius = sc.nextInt();
        System.out.print("Enter the height ");
        int height = sc.nextInt();
        double volume = 3.14 * radius * radius * height / 3;
        System.out.println(volume);
    }
}
