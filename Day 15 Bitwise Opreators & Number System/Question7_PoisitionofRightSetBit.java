public class Question7_PoisitionofRightSetBit {
    public static void main(String[] args) {

        int n = 4;
        System.out.println(findPos(n));
    }

    static int findPos(int n){
        int a = (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
        return a;
    }
}
