// find the Armstrong Number between two given number.

public class Armstrong_num {
    public static void main(String[] args) {
        int i = 0;
        int j = 500;
        while (i <= j) {
            if (fun(i) == i) {
                System.out.println(i);
            }
            i++;
        }
    }

    private static int fun(int num) {
        int sum = 0;
        if ((num * num * num) == num) return num;
        else {
            while (num != 0) {
                int a = num % 10;
                num /= 10;
                sum += (a * a * a);
            }
        }
        return sum;
    }
}
