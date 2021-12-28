// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int Num1 = sc.nextInt();

        System.out.print("Enter the second number ");
        int Num2 = sc.nextInt();

        System.out.print("Enter any operator ");
        char operator = sc.next().charAt(0);

        if(operator == '+') {
            System.out.println("The sum of these two numbers is " + (Num1 + Num2));
        }
        else if (operator == '-'){
            System.out.println("The Difference of these two numbers is "+ (Num1 - Num2));
        }
        else if (operator == '*'){
            System.out.println("The multiplication of these two numbers is "+ (Num1 * Num2));
        }
        else if (operator == '/'){
            System.out.println("The division of the two numbers is "+ (Num1 / Num2));
        }
    }
}
