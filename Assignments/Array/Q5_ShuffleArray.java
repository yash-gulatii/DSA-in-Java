import java.util.Arrays;

public class Q5_ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = 2;
        int[] ans = optimisedShuffleArray(nums,n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffleArray(int[] nums, int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            a[i] = nums[i];
            b[i] = nums[n+i];
        }

        for (int i = 0; i < nums.length; ) {
            for (int j = 0; j < n;j++) {
                    ans[i] = a[j];
                    ans[i+1] = b[j];
                    i += 2;
            }
        }

        return ans;

    }

    static int[] optimisedShuffleArray(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if (i%2==0){
                arr[i]=nums[i/2];
            }else{
                arr[i]=nums[(nums.length+i-1)/2];
            }
        }
        return arr;

    }


}
//
//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] a = new int[n];
//        int[] b = new int[n];
//        int[] ans = new int[nums.length];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = nums[i];
//            b[i] = nums[n+i];
//        }
//
//        for (int i = 0; i < nums.length; ) {
//            for (int j = 0; j < n;j++) {
//                ans[i] = a[j];
//                ans[i+1] = b[j];
//                i += 2;
//            }
//        }
//
//        return ans;
//    }
//}

