// Calculate the commission percentage

import java.util.Scanner;

public class Comission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sells amount ");
        int sells = sc.nextInt();
        System.out.print("Enter the commission ");
        int comm = sc.nextInt();
        double total = (comm/sells) * 100;
        System.out.print("Commission :"+ total +"%");

    }
}
