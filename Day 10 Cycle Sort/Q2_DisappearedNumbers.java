import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_DisappearedNumbers {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        List<Integer> ans  = search(arr);
        System.out.println(ans);


    }

    private static List<Integer> search(int[] arr) {

        List<Integer> ans = new ArrayList<Integer>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (i!=arr[i]-1){
                ans.add(i+1);
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
