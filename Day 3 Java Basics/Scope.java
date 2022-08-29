

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        {
            a = 20;
//Values of Global Variables can be changed in block.
            int c =78;
//Values initialised in this block, will remain in block
            System.out.println(c);
        }
        System.out.println(a);

        random();

//        System.out.println(c);
//Can not use outside the block. PS: This Variable was initialised in the block.

        //Scoping in for loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
        }
    }


    static void random(){
        int num = 67;
//This is in the Function Scope and Can't be used outside this function.
//And also You Can't use the Variables which is outside this function.
        System.out.println(num);
    }
}
