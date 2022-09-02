public class Q2_SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target =3;
        System.out.println(linearSearch(arr,target,1,4));
    }

    static int linearSearch(int[] arr,int a,int s, int e){
        if (arr.length == 0){
            return -1;
        }

        int ans1 = 0;
        for (int i = s; i < e; i++) {
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
