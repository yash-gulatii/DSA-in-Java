public class Question4_FindBit {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        System.out.println(findBit(n,i));

    }

    static int findBit(int n, int i){
        int m = 1;
        m = m << i-1;
        int a = n & m;
        if (a == m){
            return 1;
        }else {
            return 0;
        }
    }
}
