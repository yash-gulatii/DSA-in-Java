public class Question2_FindUnique {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,2,1,3,6,4};
        int ans = UniqueNo(arr);
        System.out.println(ans);
    }

    static int UniqueNo(int arr[]){
        int a = 0;
        for (int n: arr) {
             a ^= n;
        }
        return a;
    }
}
