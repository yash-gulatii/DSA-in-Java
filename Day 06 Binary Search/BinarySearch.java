public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10,12,14,16,18};
        int[] arr2 = {18,16,14,12,10,8,6,4,2};
        int target = 2;
        int ans1 = checkOrder(arr1,target);
        int ans2 = checkOrder(arr2,target);
        printAnswer(ans1);
        printAnswer(ans2);

    }

    static int binarySearch(int[] arr, int target) {
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
        return -1;
    }

    static int checkOrder(int[] arr, int target) {
       int f = 0;
       int l = arr.length - 1;
        int ans;
       if (arr[l] > arr[f]){
           ans = asceBinarySearch(arr,target);
       }else {
           ans = descBinarySearch(arr,target);
       }


        return ans;
    }

    static void printAnswer(int ans){
        if (ans >= 0){
            System.out.println("The Element is Present at Index: "+ ans);
        }else {
            System.out.println("The Element doesn't Exist");
        }
    }

    static int asceBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //int mid = (start+end)/2;
            // might be possible that (start+end) exceeds the range of int in java
            int mid = start+(end-start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int descBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //int mid = (start+end)/2;
            // might be possible that (start+end) exceeds the range of int in java
            int mid = start+(end-start)/2;

            if (target < arr[mid]){
                start = mid + 1;
            }else if (target > arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;

    }

}
