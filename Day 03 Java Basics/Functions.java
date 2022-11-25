import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();
       int ans = sum3(20,30);
        System.out.println(ans);

    }

    static int sum3(int a,int b){
        return a + b;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter Number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter Number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }

}
