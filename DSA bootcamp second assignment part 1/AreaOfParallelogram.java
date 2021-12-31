// Area of Parallelogram

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base ");
        float base = sc.nextFloat();
        System.out.print("Enter the height ");
        float height = sc.nextFloat();
        float area;
        area = height * base;
        System.out.println("The area of Parallelogram is "+ area);

    }

}
