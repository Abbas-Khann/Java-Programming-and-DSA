// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractTheProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        int product_of_digits =1;
        int sum_of_digits =0;
        int temp;
        while (n >0)
        {
         temp = n % 10;
         sum_of_digits += temp;
         product_of_digits *= temp;
         n/=10;
        }
        System.out.println(product_of_digits - sum_of_digits);
    }
}
