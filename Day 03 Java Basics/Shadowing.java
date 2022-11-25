

public class Shadowing {
    static int x = 90; //This will be shadowed or overlapped at line 8.
    public static void main(String[] args) {
        System.out.println(x);
        int x; //The Class variable at line 4 is shadowed by this.
//        System.out.println(x); //Scope will begin when value is initialised
        x = 40;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
