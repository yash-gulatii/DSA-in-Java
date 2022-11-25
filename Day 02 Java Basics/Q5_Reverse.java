import java.util.Scanner;

public class Q5_Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int result = 0;

        while (a > 0){
            int rem = a % 10;
            result = (result * 10) + rem;
            a /= 10;

        }

        System.out.println(result);
    }
}
