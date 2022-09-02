public class Q3_MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,7,3,14,28};
        System.out.println(findMinNum(arr));
    }

    static int findMinNum(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
