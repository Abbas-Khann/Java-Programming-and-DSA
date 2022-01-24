import java.util.Scanner;

public class Product {
    public static int product (int n1, int n2) {
        return  n1 * n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The product of these two numbers is : "+product(num1,num2));
    }
}
