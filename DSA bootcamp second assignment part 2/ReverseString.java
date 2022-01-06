// Reverse a string

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int length = string.length();
        String reverse = "";
        for (int i = length-1; i>=0; i--) {
            reverse+= string.charAt(i);
        }
        System.out.println("The ");
    }
}