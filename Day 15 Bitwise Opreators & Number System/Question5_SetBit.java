public class Question5_SetBit {
    public static void main(String[] args) {
        int n = 6;
        int i = 1;
        System.out.println(setBit(n,i));

    }

    static int setBit(int n, int i){
        int m = 1;
        if (i>0){
            m = m << i-1;
            int a = n | m;
            return a;
        }else {
            return n;
        }

    }
}
