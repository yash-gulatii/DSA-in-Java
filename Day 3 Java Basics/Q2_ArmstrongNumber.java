import java.util.Scanner;

public class Q2_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();

        for(int i = 0; i < 100000; i++){
            if (isArmNum(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmNum(int a) {
        int sum = 0;
        int temp = a;
        int length = (int) (Math.log10(a) + 1);
        while (a > 0){
            int rem = a % 10;
            int cube = (int) Math.pow(rem,length);
            sum += cube;
            a /= 10;
        }
        return sum == temp;

    }
}
