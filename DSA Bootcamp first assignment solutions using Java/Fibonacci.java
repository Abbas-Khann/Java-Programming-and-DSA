// Calculate Fibonacci series upto n numbers

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int pdig = 0;
        int cdig = 1;

        System.out.println(pdig);
        System.out.println(cdig);
        for (int i = 0; i <n; i++)
        {
            System.out.println(cdig);
        }

    }
}
