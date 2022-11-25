
import java.util.Arrays;

public class PassingExample {
    public static void main(String[] args) {
        // Create am array
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num) {
        num[0] = 99;
    }
}
