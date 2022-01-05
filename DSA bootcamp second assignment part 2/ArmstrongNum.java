// Find the Armstrong number

// An Armstrong number, also known as narcissistic number, is a number that is equal
// to the sum of the cubes of its own digits. For example, 370 is an Armstrong number
// since 370 = 3*3*3 + 7*7*7 + 0*0*0 .

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int num1 = n;
        int sum = 0;
        while (n > 0){
            int dig = n % 10;           // 370 -> 0
            sum = sum + (dig * dig * dig);
            n/=10;
        }

        if (sum == num1){
            System.out.print("It is an armstrong number ");
        }
        else{
            System.out.println("It is not an armstrong number");
        }

    }
}
