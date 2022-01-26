import java.util.Scanner;

public class Palindrome {
    public static int palindrome(int number) {
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int pali = palindrome(num);
        if (num == pali){
            System.out.print("It is a palindrome number ");
        }
        else {
            System.out.print("It is not a palindrome number ");
        }
    }
}
