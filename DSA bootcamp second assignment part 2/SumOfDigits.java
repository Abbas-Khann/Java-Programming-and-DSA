// Find the sum of digits of a number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            sum+=rem;
            n/=10;
        }
        System.out.println("Sum of digits of this number is : "+sum);

    }
}
