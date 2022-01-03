// Calculate the discount of a product

//Just follow these few simple steps:
//
//  1.      Find the original price (for example $90)
//  2.      Get the the discount percentage (for example 20%)
//  3.     Calculate the savings: 20% of $90 = $18
//  4.     Subtract the savings from the original price to get the sale price: $90 - $18 = $72
//  5.      You're all set.

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price ");
        double price = sc.nextDouble();
        System.out.print("Enter the discount percentage ");
        double discount = sc.nextDouble();
        double saving = price * discount / 100;
        double new_price = price - saving;
        System.out.println("The new price is "+ new_price);

    }
}
