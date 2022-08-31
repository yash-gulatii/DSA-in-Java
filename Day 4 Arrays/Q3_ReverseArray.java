import java.util.Arrays;

public class Q3_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr){
        int length = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[length];
            arr[length] = temp;
            length--;
        }
    }
}
