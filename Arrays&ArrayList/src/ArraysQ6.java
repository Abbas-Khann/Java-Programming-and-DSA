import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysQ6 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean test = false;
            for (int j = 0; j < n; j++) {
                if(candies[i] + extraCandies < candies[j]){
                    test = true;
                    break;
                }
            }
            if (test) {
                ans.add(false);
            }
            else {
                ans.add(true);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int [] candies = {2,3,5,1,3};
    int extraCandies = 3;
        System.out.println((kidsWithCandies(candies, extraCandies)));
    }
}
