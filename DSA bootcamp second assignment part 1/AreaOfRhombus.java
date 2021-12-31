// Area of Rhombus

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Diagonal p ");
        float Diag_p = sc.nextFloat();
        System.out.print("Enter the Diagonal q ");
        float Diag_q = sc.nextFloat();
        float area = Diag_p * Diag_q/2;
        System.out.println("The area of Rhombus is "+ area);
    }
}
