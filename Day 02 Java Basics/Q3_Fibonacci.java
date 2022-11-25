import java.util.Scanner;

public class Q3_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int r = 0;

        for (int count = 2; count<=n; count++){
            r = a + b;
            a = b;
            b = r;
        }

        System.out.println(r);

    }
}
