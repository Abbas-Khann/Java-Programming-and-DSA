// Calculate the CGPA of a program

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total score of 6 subjects ");
        double score = sc.nextDouble();
        double CGPA = ((score / 600) * 100)/ 9.5;
        System.out.print("Your CGPA is "+ CGPA +" %");

    }
}
