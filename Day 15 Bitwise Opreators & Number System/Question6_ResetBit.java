public class Question6_ResetBit {
    public static void main(String[] args) {
        int n = 4;
        int i = 3;
        System.out.println(resetBit(n,i));
    }

    static int resetBit(int n, int i){
        int m = 1;
        m = ~(m << i-1);
        int a = n & m;
        return a;
    }
}
