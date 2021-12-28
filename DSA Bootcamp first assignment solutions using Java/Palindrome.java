// Find whether the given  string is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = sc.next();

        for (int i = 0; i < ((word.length() - 1) / 2); i++) {
            if (word.charAt(word.length() - (i + 1)) != word.charAt(i)) {
                System.out.println("It is not a palindrome");
                return;
            }
            else{
                System.out.println("It is a Palindrome");
            }
        }
    }
}