// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount ");
        int pri;
        pri = sc.nextInt();

        System.out.println("Enter the time period ");
        double time = sc.nextInt();

        System.out.println("Enter the rate ");
        double rate = sc.nextDouble();

        double S_I = (pri * time * rate ) /100;
        System.out.println("Simple interest is " + S_I);

    }

}
