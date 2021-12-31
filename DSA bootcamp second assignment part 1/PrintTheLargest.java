//  Take integer inputs till the user enters 0 and print the largest number from a

import java.util.Scanner;

public class PrintTheLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest =0;
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        while (num !=0){
            if(num > largest)
                largest = num;
            num = sc.nextInt();
        }
        System.out.println(largest);
    }
}
