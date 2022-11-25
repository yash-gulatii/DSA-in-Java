import java.util.Scanner;

public class Q4_NumOccurrence{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int num = in.nextInt();
        int count = 0;

        while (a > 0){
            int rem = a % 10;
            a /= 10;
            if (rem == num){
                count++;
            }

        }

        System.out.println(count);
    }
}
