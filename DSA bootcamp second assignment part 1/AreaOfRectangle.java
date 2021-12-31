// Finding the area of a rectangle

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height ");
        double height = sc.nextDouble();
        System.out.print("Enter the width ");
        double width = sc.nextDouble();
        double area = width * height;
        System.out.println(area);

    }
}
