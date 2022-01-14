// Find the reverse of a number

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        int reverse = 0;
        while(n > 0){

            int rem = n % 10;
            n/=10;
            reverse = rem;
            System.out.print(reverse);
        }

    }
}
