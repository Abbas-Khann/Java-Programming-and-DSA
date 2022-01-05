// Sum of N numbers

import java.util.Scanner;

public class SumofNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers do you want to add : ");
        int t = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sum +=n;         // This can also be written as sum = sum + n;
        }
        System.out.print("Sum of these numbers is : "+ sum);
    }
}