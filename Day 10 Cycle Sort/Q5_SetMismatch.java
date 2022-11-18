import java.util.Arrays;

public class Q5_SetMismatch {

    public static void main(String[] args) {

        int[] arr = {1,2,2,4};
        sort(arr);
        int[] ans  = search(arr);
        System.out.println(Arrays.toString(ans));


    }

    private static int[] search(int[] arr) {


        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr[i]-1){
                ans[0] = arr[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }

    private static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            if (arr[i] != arr[arr[i]-1] && i != arr[i]-1) {
                swap(arr, i, arr[i]-1);
            }else {
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
