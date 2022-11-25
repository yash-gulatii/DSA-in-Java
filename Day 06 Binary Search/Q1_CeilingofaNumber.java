// Question Link https://leetcode.com/problems/search-insert-position/



public class Q1_CeilingofaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int ans = ceiling2(arr,target);
        System.out.println(ans);

    }

    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start<=end){
             mid = start+(end-start)/2;
            if (target<arr[mid]){
                if (start==end || start==mid){
                    return mid;
                }else {
                    end = mid - 1;
                }
            }else if (target>arr[mid]){
                start = mid + 1;
            } else if (target==arr[mid]) {
                return mid;
            }
        }
        return mid+1;


    }

//    return the index of smallest no >= target
    static int ceiling2(int[] arr, int target) {

//      But What if the target is greater than the greatest number in the array
        if (target > arr[arr.length-1]){
            return  -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}

   