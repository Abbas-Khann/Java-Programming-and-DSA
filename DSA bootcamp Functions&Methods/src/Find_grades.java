import java.util.Scanner;

public class Find_grades {
    static String scores (int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid scores ");
        }

        switch (score / 10) {
            case 10:

            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
                return "E";
            default:
                return "You have failed, Wtf were you doing the entire semester?";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score value : ");
        int score = sc.nextInt();

        System.out.println("Grade = "+scores(score));

    }
}
