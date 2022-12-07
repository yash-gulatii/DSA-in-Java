public class NumberProgram {
    public static void main(String[] args) {
        // Write a Function that takes in a number and prints it
        // Print First 5 Numbers: 1 2 3 4 5
        print(1);

    }

//    With Recursion

    static void print(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);


//        Recursive Call
//        If you are calling a function again and again, you can treat it as a separate call in the stack

//        This is called Tail Recursion
//        This is the last function call
        print(n+1);
    }

//    Without Recursion

//    static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int n){
//        System.out.println(n);
//        print5(5);
//    }
//    static void print5(int n){
//        System.out.println(n);
//    }

}
