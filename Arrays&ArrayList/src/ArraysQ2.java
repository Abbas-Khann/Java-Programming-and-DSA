import java.util.Arrays;

public class ArraysQ2 {
    public static int [] getConcatenation (int [] nums) {
        int n = nums.length;
        int ans [] = new int [2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans [i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
    int [] nums = new int [] {1,2,1,1};
    int ans [] = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}
