// Print whether the number is even or odd

import java.util.Scanner;

public class HelloJava {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);   //Taking Input
        System.out.print("Enter a number ");
        int num;
        num = input.nextInt();
        if (num % 2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

    }
}