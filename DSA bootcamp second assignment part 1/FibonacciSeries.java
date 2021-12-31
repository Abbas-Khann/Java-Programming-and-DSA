// Finding the Fibonacci Series

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_term = 0; int second_term = 1;
        int num = sc.nextInt();
        System.out.println("Fibonacci Series Upto " + num + ": ");
        while (first_term <= num){
            System.out.print(first_term + ", ");
            int next_term = first_term + second_term;
            first_term = second_term;
            second_term = next_term;
        }
    }
}
