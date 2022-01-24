// Program to find even or odd of a number in Java

import java.util.Scanner;

public class Even_Odd {
    public static boolean Even_ODD(int num) {
       return (num % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if (Even_ODD(number)){
            System.out.println(number+ " is an even number ");
        }
        else{
            System.out.println(number+ " is an odd number ");
        }

    }
}
