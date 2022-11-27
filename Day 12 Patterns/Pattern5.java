public class Pattern5 {
    public static void main(String[] args) {
       pattern5(4);
    }

//    Pattern 5
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *

    static void pattern5(int n){
        for (int row = 1; row <= n+(n-1); row++) {
            if (row>n){
                for (int col = 1; col <= (n+n)-row; col++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }else{
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }
    }

}
