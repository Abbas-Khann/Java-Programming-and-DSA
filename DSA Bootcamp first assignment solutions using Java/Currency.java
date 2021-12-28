//    Input currency in rmb and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the currency in rmb");
        float rmb = sc.nextInt();

        System.out.println(rmb + " rmb in dollars is "+ rmb/6.63);
    }
}
