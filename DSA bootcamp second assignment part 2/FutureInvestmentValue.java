// Future investment Value program

import java.util.Scanner;

// Future Investment Value
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the present value : ");
        double present_value = sc.nextDouble();
        System.out.print("Enter the interest rate : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time : ");
        double time = sc.nextDouble();
        double future_value = present_value * (1 + rate * time);
        System.out.println("The future Investment value is "+ future_value );
    }
}