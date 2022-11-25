public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);



     System.out.println("a = "+a+"  &  b = "+b);

     String name = "Yash Gulati";
     changeName(name);
     System.out.println(name);
    }

     static void changeName(String name) {
        name = "Not Yash Gulati";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
