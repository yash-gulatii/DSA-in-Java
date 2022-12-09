public class FiboImproved {
    public static void main(String[] args) {

        System.out.println(fibonacciNo(50));

    }

    static int fibonacciNo(int n){
        return (int)(Math.pow((1+Math.sqrt(5))/2,n)  / Math.sqrt(5));
    }


}
