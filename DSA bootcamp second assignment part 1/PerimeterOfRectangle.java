// Finding the Perimeter of a Rectangle

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length ");
        float length = sc.nextFloat();
        System.out.print("Enter the width ");
        float width = sc.nextFloat();
        float Perimeter = 2 *(length * width);
        System.out.println(Perimeter);
    }
}
