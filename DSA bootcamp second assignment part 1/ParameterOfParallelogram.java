// Finding the Parameter of a Parallelogram

import java.util.Scanner;

public class ParameterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side ");
        float side = sc.nextFloat();
        System.out.print("Enter the base ");
        float base = sc.nextFloat();
        float Paremeter = 2 * (side + base);
        System.out.println(Paremeter);
    }

}
