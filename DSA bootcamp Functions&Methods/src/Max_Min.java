import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = max(num1, num2, num3);
        int min = min(num1, num2, num3);

        System.out.println("The largest number out of these three numbers is : "+max);
        System.out.println("The smallest number out of these three numbers is :" +min);
    }

    public static int max(int n1, int n2, int n3) {
        int max = n1;
        if (n2 > max){
            max = n2;
        }
        if (n3 > max){
            max = n3;
        }
        return max;
    }

    public static int min(int n1, int n2, int n3) {
        int min = n1;
        if (n2 < min){
            min = n2;
        }
        if (n3 < min){
            min = n3;
        }
        return min;
    }
}
