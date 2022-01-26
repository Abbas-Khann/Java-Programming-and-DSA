import java.util.Scanner;

public class returnAllPrimenumbers {
   public static boolean checkPrime(int n) {
       if (n <= 1) {
           return false;
       }
       boolean ans = true;
       int i = 2;
       while (i * i <= n){
           if (n % i == 0)
           ans = false;
           break;
       }
       return ans;
   }

   public static void TwoPrimeNums (int num1 , int num2) {
       for (int i = num1; i <=num2; i++) {
           if (checkPrime(i)){
               System.out.print(i+ " ");
           }
       }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        TwoPrimeNums(n1,n2);
    }
}