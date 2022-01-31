// Find the occurence of a number in this program

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some numbers ");
        int n = sc.nextInt();
        System.out.println("Which number's occurence do you want to find ");
        int d = sc.nextInt();
        int count = 0;

        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == d) {
                count++;
            }

        }
        System.out.println(count);
    }
}