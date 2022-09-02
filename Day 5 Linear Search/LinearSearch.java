import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//      Defining Array:
        int[] arr = {18,12,9,14,77,50};
//      Taking Input:
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the Number You Want to Search: ");
        int a = in.nextInt();
//      Searching the Array:
        int ans = linearSearch(arr,a);
//      Printing the Answer:
        printAnswer(ans);
    }

     static void printAnswer(int ans) {
         if (ans>0){
             System.out.println("The Value Exist in the Array at Index: "+ans);
         }else {
             System.out.println("The Value Does Not Exist in the Array.");
         }
    }

    static int linearSearch(int[] arr,int a){
        if (arr.length == 0){
            return -1;
        }

        int ans1 = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (a == arr[i]) {
                ans1 = i;
                break;
            } else {
                ans1 = -1;
            }
        }
        return ans1;
    }


}
