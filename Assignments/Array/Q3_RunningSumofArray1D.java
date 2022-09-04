import java.util.Arrays;

public class Q3_RunningSumofArray1D {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int sum = nums[0];
        int[] ans = new int[nums.length];
        ans[0] = sum;
        for (int i = 1; i < nums.length ; i++) {
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;

    }
}

//class Solution {
//    public int[] runningSum(int[] nums) {
//        int sum = nums[0];
//        int[] ans = new int[nums.length];
//        ans[0] = sum;
//        for (int i = 1; i < nums.length ; i++) {
//            sum += nums[i];
//            ans[i] = sum;
//        }
//
//        return ans;
//    }
//}