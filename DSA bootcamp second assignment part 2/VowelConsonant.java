// Find the vowel or consonant

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char c = sc.next().trim().charAt(0);
        if (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I'|| c == 'o' || c == 'O' || c == 'u' || c == 'U'){
            System.out.println("It is a vowel ");
        }
        else
            System.out.println("It is a consonant ");
    }
}
