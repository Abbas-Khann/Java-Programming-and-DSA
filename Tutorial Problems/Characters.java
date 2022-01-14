// Check if the character is an uppercase or a lowercase

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {;
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Case");
        }

    }
}
