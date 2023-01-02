public class Question3_FindUnique_NegElements {
    public static void main(String[] args) {
        int arr[] = {-2,3,2,4,-5,5,-4};
        System.out.println(findUnique(arr));
    }

    static int findUnique(int arr[]){
        int a = 0;
        for (int n: arr){
            a += n;
        }
        return a;
    }
}
