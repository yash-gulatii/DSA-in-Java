import java.util.ArrayList;
import java.util.List;

public class Q3_DuplicateNumbers {

    public static void main(String[] args) {

        int[] arr = {3,1,3,4,2};
        sort(arr);
        int ans  = search(arr);
        System.out.println(ans);


    }

    private static int search(int[] arr) {


        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr[i]-1){
                ans = arr[i];
            }
        }
        return ans;
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
