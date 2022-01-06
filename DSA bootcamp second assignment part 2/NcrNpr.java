// NCR and NPR
//      nPr = n!/(n-r)!
//        nCr = n!/[r! (n-r)!]



import java.util.Scanner;

public class NcrNpr {

    static long fact (int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two values n and r : ");
        int r , n;
        r = sc.nextInt();
        n = sc.nextInt();
        long npr = fact(n)/fact(n-r);
        long ncr = (fact(n) / fact(r)) / fact(n-r);
        System.out.println("NPR : "+ npr);
        System.out.println("NCR : "+ ncr);
    }
}
