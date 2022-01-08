// Highest Common factor of two numbers


import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <=n1; i++) {
            if (n1 % i == 0 && n2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("The highest common factor of these two numbers is : "+ hcf);
    }

}




// This code only works if the remainder is 0 on the first go.


//public class HCF {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers : ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int max, min = 0;
//        int div = 0;
//        int div2 = 0;
//        if (a > b) {
//            max = a;
//            min = b;
//        } else {
//            max = b;
//            min = a;
//        }
//        while (true) {
//            div = max % min;
//            div2 = min % div;
//            break;
//        }
//        if (div2 == 0) {
//            System.out.print("HCF :" + div);
//        }
//    }
//}
