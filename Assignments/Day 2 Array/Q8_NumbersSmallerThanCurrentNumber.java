import java.util.Arrays;

public class Q8_NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[]  nums = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbers(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbers(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;


    }
}

//
//class Solution {
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int num : nums) {
//                if (num < nums[i]) {
//                    count++;
//                }
//            }
//            ans[i] = count;
//        }
//        return ans;
//    }
//}
