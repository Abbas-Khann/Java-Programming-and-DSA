// Find the average marks

import java.util.Scanner;

public class averageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects ");
        int num = sc.nextInt();
        long sum = 0;
        double average = 0;
        for (int i = 0; i < num; i++) {
         int temp = sc.nextInt();
            sum+=temp;
        }
        average = sum/num;
        System.out.print("The average is "+ average +"%");
    }
}