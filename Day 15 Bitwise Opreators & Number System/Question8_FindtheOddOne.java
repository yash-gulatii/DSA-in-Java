public class Question8_FindtheOddOne {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8,3,3,6};
        int repeatVal = 3;
        System.out.println(findUnique(arr,repeatVal));
    }

    //	sum of all the sets

    static int[] sum_set = new int[16];

    static int findUnique(int[] arr, int val){

        for ( int i: arr){
            int c = 0;
            while (i>0){
                sum_set[c] = sum_set[c] + i % 2;
                i/=2;
                c++;
            }
        }

        // convert to decimal

        int ans = 0;
        for (int j = 0; j < sum_set.length; j++) {

            ans += (sum_set[j] % val) * (int) (Math.pow(2, j));
        }
        return ans;
    }
}