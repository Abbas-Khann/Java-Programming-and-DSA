// Finding the Perimeter of a Square

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides ");
        int sides = sc.nextInt();
        int Perimeter = 4 * sides;
        System.out.print("The Perimeter of a square is "+ Perimeter);

    }
}
