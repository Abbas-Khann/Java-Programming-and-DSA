// Calculate the batting average

import java.util.Scanner;

public class Batting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the runs scored by Gurbaz "); // Gurbaz is my favorite batsman btw :)
        int runs = sc.nextInt();
        System.out.print("Enter the amount of times he's lost his wicket ");
        int out = sc.nextInt();
        double average = runs / out;
        System.out.println("Gurbaz's batting average is "+ average);

    }
}
