//    Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int Num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int Num2 = sc.nextInt();

        int largest;
        if(Num1 > Num2)
        {
            largest = Num1;
        }
        else{
            largest = Num2;
        }
        System.out.println("The largest number out of these two is "+ largest);
    }
}
