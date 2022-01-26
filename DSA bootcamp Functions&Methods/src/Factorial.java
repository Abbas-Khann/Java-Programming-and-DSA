import java.util.Scanner;

public class Factorial {
    public static int Factorial (int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
             fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int f = Factorial(num);
        System.out.print("The factorial of this number is : "+f);
    }
}
