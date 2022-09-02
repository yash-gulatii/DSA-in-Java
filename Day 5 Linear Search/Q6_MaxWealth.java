// Question Link https://leetcode.com/problems/richest-customer-wealth/#:~:text=The%20richest%20customer%20is%20the,6%20each%2C%20so%20return%206.

public class Q6_MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {


        int maxSum = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowSum = 0;
            for (int a : account) {
                rowSum = rowSum + a;
            }

            if(maxSum < rowSum){
                maxSum = rowSum;
            }
        }

        return maxSum;

    }

}
