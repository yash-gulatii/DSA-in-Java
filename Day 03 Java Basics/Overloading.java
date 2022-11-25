public class Overloading {
    public static void main(String[] args) {
        fun(56);
        fun("Yash");
    }

    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);

    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}
