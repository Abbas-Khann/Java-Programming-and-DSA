// Finding Prime numbers using Factorization

import java.util.Scanner;

public class PrimeNumbers {
    public static String Prime (int num) {
        int factors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                factors++;
            }
        }
        if (factors == 2){
            return num+ " is a prime number ";
        }
        else{
            return num+ " is a composite number, Not a prime number. ";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String prime = Prime(n);
        System.out.println(prime);
    }
}
