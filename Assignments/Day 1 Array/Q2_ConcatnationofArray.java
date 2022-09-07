import java.util.Arrays;

public class Q2_ConcatnationofArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = concatArray(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] concatArray(int[] nums) {
        int n = nums.length;
        int[] a = new int[n*2];
         for (int i = 0; i < n; i++) {
             a[i] = nums[i];
             a[i+n] = nums[i];
         }
         return a;
    }
}
