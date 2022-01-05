// Calculate the depreciation of value

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the booking amount ");
        double amount = sc.nextDouble();
        System.out.print("Enter the time in years ");
        double year = sc.nextDouble();
        System.out.print("Enter the Deprecation ");
        double dep = sc.nextDouble();

        while(year !=0){
            year = year - 1;
            amount = ((100-dep) * amount)/100;
        }
        System.out.print("Value :"+ amount);
    }
}
