// Calculate the electricity Bill

import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed ");
        double units = sc.nextDouble();
        System.out.print("Enter the price ");
        int p = sc.nextInt();
        System.out.println("The electricity bill is "+ p * units);
    }
}
