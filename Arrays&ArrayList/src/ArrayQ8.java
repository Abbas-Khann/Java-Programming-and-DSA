import java.util.Arrays;

public class ArrayQ8 {
    public static int [] smallerNumbersThanCurrent(int [] nums){
        int n = nums.length;
        int [] ans = new int [n];
        for (int i = 0; i < n; i++) {
        int countSmaller = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j] && j != i) {
                    countSmaller++;
                }
            }
            ans[i] = countSmaller;
        }
        return ans;
    }

    public static void main(String[] args) {
    int [] nums = {8,1,2,2,3};
    int [] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
}
