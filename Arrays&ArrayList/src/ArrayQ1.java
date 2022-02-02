// Solution to the leetcode problem build array from permutation

import java.util.Arrays;

public class ArrayQ1 {
        public static int [] buildArray (int[] nums) {
            int num = nums.length;
            int [] ans = new int[num];
            for(int i = 0; i < num; i++){
                ans[i] = nums[nums[i]]; // ans is equal to nums of nums at i
            }
            return ans;
        }

    public static void main(String[] args) {
            int [] nums = new int [] {0, 2, 1, 5, 3, 4};
            int [] ans  = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
