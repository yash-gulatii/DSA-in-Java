import java.util.Arrays;

public class Q6_MissingPositive {
    public static void main(String[] args) {

        int[] arr = {1,1};
        sort(arr);
        int ans  = search(arr);
        System.out.println(ans);


    }

    private static int search(int[] arr) {

        int i = 0;
        while (i < arr.length){
            if(arr[i]!=i+1){
                return i+1;
            }
            i++;
        }

        return arr.length+1;
    }

    private static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i]-1]) {
                swap(arr, i, arr[i]-1);
            } else {
                i++;
            }

        }

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
