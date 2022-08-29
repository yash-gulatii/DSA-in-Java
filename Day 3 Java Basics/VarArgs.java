import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(3,4,5,6,7,8,3);
    multiple(56,34,"Yash","Ramesh","Suresh");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a+" "+b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
