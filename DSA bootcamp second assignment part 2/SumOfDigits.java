// Find the sum of digits of a number

import java.util.Scanner;

public class SumOfDigits {   // 1234 = 1+2+3+4 = 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum += rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
