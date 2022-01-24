import java.util.Scanner;

public class Vote_Eligibility {

 public static String Eligibility (int age) {
     if (age >= 18){
         return "You are eligible to vote";
     }
     else {
         return "You are not eligible to vote";
     }

 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age :");
        int num = sc.nextInt();
        String vote = Eligibility(num);
        System.out.println(vote);
    }
}
