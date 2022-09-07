public class Q7_NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int ans = pairs(nums);
        System.out.println(ans);
    }

    static int pairs(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i<j){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
//
//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i<j){
//                    count = count + 1;
//                }
//            }
//        }
//        return count;
//    }
//}