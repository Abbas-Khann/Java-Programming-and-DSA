// Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name here ");
        String name = sc.next();
        System.out.println("Hello " + name +" How's it going fellow programmer");
    }
}
