public class Q1_CeilingofaNumber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int target = 0;
        int ans = ceiling(arr,target);
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
}
