// Find the nth fibonacci number

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int next = 0;
        int n = sc.nextInt();

        while (first <= n) {

            next = first + second;
            first = second;
            second = next;
        }
        System.out.println(next);
      }
    }
