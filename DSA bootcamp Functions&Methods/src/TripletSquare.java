import java.util.Scanner;

public class TripletSquare {
    public static boolean Triplet (int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = arr[i] * arr[i] , y = arr[j] * arr[j] , z = arr[k] * arr[k];
                    if (x == y + z || y == x + z || z == x + y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = { 3, 1, 4, 6, 5 };
        int arr_size = arr.length;
        if (Triplet(arr,arr_size) == true) {
            System.out.println("Yes!");
        }
        else {
            System.out.println("Noooo!");
        }
    }
}
