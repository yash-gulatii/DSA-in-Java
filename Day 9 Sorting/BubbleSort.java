import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubble(int[] array){
        boolean swapped;
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 1; j < n-i; j++) {
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
