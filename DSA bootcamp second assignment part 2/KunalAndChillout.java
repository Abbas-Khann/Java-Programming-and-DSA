import java.util.Scanner;

public class KunalAndChillout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int august = 31;
        int count = 0;
        for (int i = 1; i < august; i++) {
          if (i % 2 == 0){
              count++;
          }
        }
        System.out.println("Number of Days kunal can go out in month of August : "+count);
    }
}
