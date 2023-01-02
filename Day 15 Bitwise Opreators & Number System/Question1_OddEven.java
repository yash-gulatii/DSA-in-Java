public class Question1_OddEven {
    public static void main(String[] args) {
        checkOddEven(2);

    }

    static void checkOddEven(int n){
        if ((n&1) == 1){
            System.out.println("The number " + n + " is Odd");
        }

        else {
            System.out.println("The number " + n + " is Even");
        }
    }
}
