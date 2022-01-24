import java.util.Scanner;

public class EvenOrOdd {

    public static String Even_Odd (int n) {
        String even = "This is an even number ";
        String odd = "This is an odd number";
        if (n % 2 == 0){
            return even;
        }
        else{
            return odd;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String Even_odd = Even_Odd(num);
        System.out.println(Even_odd);

    }
}
