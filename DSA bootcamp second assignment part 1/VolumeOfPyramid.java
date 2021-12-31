// Volume of a Pyramid

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length ");
        Double length = sc.nextDouble();
        System.out.print("Enter the height ");
        double height = sc.nextDouble();
        System.out.print("Enter the width ");
        Double width = sc.nextDouble();
        double volume = length * width * height / 3;
        System.out.println(volume);

    }
}
