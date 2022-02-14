// Leetcode problem Shuffle the array

import java.util.Arrays;

public class ArrayQ5 {
    public static int [] shuffle (int [] nums, int n) {
        int[] res = new int[2 * n];
        int j = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            res[i] = nums[j];
            res[i + 1] = nums[j + n];
            j++;
        }
        return res;
    }
        public static void main (String [] args) {
            int [] nums = {2,5,1,3,4,7};
            int  [] answer  = shuffle(nums, 3);
            System.out.println(Arrays.toString(answer));
        }
    }
