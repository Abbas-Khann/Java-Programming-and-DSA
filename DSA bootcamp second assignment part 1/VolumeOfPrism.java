// Finding the volume of a Prism

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base ");
        int base = sc.nextInt();
        System.out.print("Enter the height ");
        int height = sc.nextInt();
        double volume = base * height;
        System.out.println(volume);

    }
}
