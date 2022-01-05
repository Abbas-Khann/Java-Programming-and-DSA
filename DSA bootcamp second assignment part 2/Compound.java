// Compound interest program in Java

import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal");
        int prin = sc.nextInt();
        System.out.print("Enter the interest rate ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of times interest is compounded ");
        int num_o_time = sc.nextInt();
        double amount = (prin*(Math.pow((1+(rate/100)),num_o_time))) - prin;
        System.out.print(amount);
        
    }
}
