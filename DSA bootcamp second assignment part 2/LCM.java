// Find the least common multiple of two numbers


import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = 0;
        int hcf = 1;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
            lcm = (num1 * num2)/hcf;
        }
        System.out.print("The LCM of these two numbers is :"+lcm);
    }
}
