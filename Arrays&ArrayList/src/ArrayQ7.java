public class ArrayQ7 {
    public static int NumIdenticalPairs(int [] nums){
        int n = nums.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
    int [] nums = {1,2,3,1,1,3};
        int ans = NumIdenticalPairs(nums);
        System.out.println(ans);
    }
}
