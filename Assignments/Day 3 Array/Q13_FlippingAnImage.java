import java.util.Arrays;

public class Q13_FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int n = image.length;
        int[][] ans = reverseArray(image,n);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] reverseArray(int[][] image, int n){
        int[][] reverseArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n-1;
            while (start<=end){
                reverseArray[i][start] = image[i][end];
                reverseArray[i][end] = image[i][start];
                start++;
                end--;
            }
        }

        return invertArray(reverseArray,n);
    }

    static int[][] invertArray(int[][] reverseArray, int n){
        int[][] invertArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (reverseArray[i][j] == 1){
                    invertArray[i][j] = 0;
                } else if (reverseArray[i][j] == 0) {
                    invertArray[i][j] = 1;
                }
            }
        }

        return invertArray;


    }
}

//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//        int n = image.length;
//        int[][] reverseArray = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            int start = 0;
//            int end = n-1;
//            while (start<=end){
//                reverseArray[i][start] = image[i][end];
//                reverseArray[i][end] = image[i][start];
//                start++;
//                end--;
//            }
//        }
//
//        return invertArray(reverseArray,n);
//    }
//
//    public int[][] invertArray(int[][] reverseArray, int n){
//        int[][] invertArray = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (reverseArray[i][j] == 1){
//                    invertArray[i][j] = 0;
//                } else if (reverseArray[i][j] == 0) {
//                    invertArray[i][j] = 1;
//                }
//            }
//        }
//
//        return invertArray;
//
//
//    }
//}
