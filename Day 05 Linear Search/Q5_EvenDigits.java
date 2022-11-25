// Question Link https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Q5_EvenDigits {
    public static void main(String[] args) {
        int[] arr ={555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if(even(num)){
                sum++;
            }

        }

        return sum;
    }

     static boolean even(int num) {
         int numberOfDigits = digits(num);
         return numberOfDigits % 2 == 0;
     }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
