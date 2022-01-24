import java.util.Scanner;

public class Sum {
    public static int add (int num1 , int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = add(n1,n2);
        System.out.println("The sum of these two numbers is "+sum);
    }
}
