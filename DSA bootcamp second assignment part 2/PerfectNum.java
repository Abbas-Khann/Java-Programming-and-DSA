// Find the perfect number

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        if (num == sum){
            System.out.println("It is a perfect number");
        }
        else
            System.out.println("It is not a perfect number");
    }
}
