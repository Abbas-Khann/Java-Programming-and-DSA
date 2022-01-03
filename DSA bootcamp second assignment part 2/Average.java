// Find the average of N numbers


import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of numbers ");
        int n = sc.nextInt();
        double sum = 0;
        System.out.print("Enter the numbers ");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            sum = sum + temp;
        }
        System.out.println("The average is "+ sum/n);
    }
}