import java.util.Scanner;

public class NaturalNums {
    public static int Natural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int FindNatural = Natural(number);
        System.out.print(FindNatural);

    }
}
