// Create a calculator that can perform the basic operations

import java.util.Scanner;

public class calculatorProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user until 'x' is inputted
        int ans = 0;
        while (true) {
        // Take the operator as input
            System.out.print("Enter the operator ");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            // Input two numbers
                System.out.print("Enter two numbers ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invalid Operation! ");
            }
            System.out.println(ans);
        }
    }
}