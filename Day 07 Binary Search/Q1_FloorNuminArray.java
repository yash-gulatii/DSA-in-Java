public class Q1_FloorNuminArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,23,45,68};
        int target = 0;
        int ans = floor2(arr,target);
        System.out.println(ans);

    }

    //    return the index of greatest no <= target
    static int floor2(int[] arr, int target) {
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
        return end;
    }

    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start<=end){
            mid = start+(end-start)/2;
            if (target>arr[mid]){
                if (start==end || start==mid){
                    return mid;
                }else {
                    start = mid + 1;
                }
            }else if (target<arr[mid]){
                end = mid - 1;
            } else if (target==arr[mid]) {
                return mid;
            }
        }
        return mid;


    }
}