public class Q2_MaxArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(maxRange(arr,0,4));
    }

    static int maxRange(int[] arr,int start, int end){
        int max = arr[start];
        for (int i = start; i < end; i++) {
               if (arr[i] > max){
                   max = arr[i];
               }
        }
        return max;

    }

}
