// Power program

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int p = sc.nextInt();
        System.out.print("The power of this number is "+ Math.pow(p,2)); // The value can be changed here to another value
    }
}
