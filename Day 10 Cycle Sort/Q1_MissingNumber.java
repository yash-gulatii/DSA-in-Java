import java.util.Arrays;

public class Q1_MissingNumber {

    public static void main(String[] args) {

        int[] arr = {4,0,2,1};
        sort(arr);
        int ans  = search(arr);
        System.out.println(ans);


    }

    private static int search(int[] arr) {

        int i = 0;
        while (i < arr.length){
            if(i!=arr[i]){
                return i;
            }
            i++;
        }

        return arr.length;
    }

    private static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            if (arr[i] != arr[arr[i]-1] && i != arr[i]-1) {
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
