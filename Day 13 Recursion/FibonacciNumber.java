public class FibonacciNumber {
    public static void main(String[] args) {

        System.out.println(fibonacciNo(19));

    }

    static int fibonacciNo(int n){
        if (n < 2){
            return n;
        }
        return fibonacciNo(n-1)+fibonacciNo(n-2);


    }
}
