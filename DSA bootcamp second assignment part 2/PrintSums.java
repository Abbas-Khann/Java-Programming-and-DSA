// Write a program to print the sum of negative numbers
// sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

import java.util.Scanner;

public class PrintSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some numbers : ");
        int n = sc.nextInt();
        int sum_of_negative = 0;
        int sum_of_positive_even = 0;
        int sum_of_positive_odd = 0;
        while (n != 0){
            if (n < 0){
                sum_of_negative += n;
            }
            if (n > 0){
                if (n % 2 == 0){
                    sum_of_positive_even += n;
                }
                else{
                    sum_of_positive_odd += n;
                }
            }
             n = sc.nextInt();
        }
        System.out.println("The sum of negative numbers "+ sum_of_negative);
        System.out.println("The sum of positive even numbers is "+ sum_of_positive_even);
        System.out.println("The sum of positive odd numbers is "+ sum_of_positive_odd);
    }
}
