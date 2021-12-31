// Finding the Total Surface Area of a Cube

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides ");
        int sides = sc.nextInt();
        double Total = 6 * Math.pow(sides , 2);
        System.out.println(Total);
    }
}
