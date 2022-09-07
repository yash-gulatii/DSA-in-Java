import java.util.Arrays;

public class Q9_TargetArrayinGivenOrder {
    public static void main(String[] args) {
        int[] nums = {1};
        int[] index = {0};
        int[] ans = createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums,int[] index){
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(index[i] == i)
                ans[index[i]] = nums[i];
            else{
                for(int j = nums.length -1; j > index[i]; j--)
                    ans[j] = ans[j-1];
                ans[index[i]] = nums[i];
            }

        }

        return ans;

    }
}


//
//class Solution {
//    public int[] createTargetArray(int[] nums, int[] index) {
//        int[] ans = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            if(index[i] == i)
//                ans[index[i]] = nums[i];
//            else{
//                for(int j = nums.length -1; j > index[i]; j--)
//                    ans[j] = ans[j-1];
//                ans[index[i]] = nums[i];
//            }
//
//        }
//
//        return ans;
//    }
//}