import javax.xml.namespace.QName;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name:  ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

     static String myGreet(String name) {
         return "Hello " + name;
    }

    static String greet(){
        return "How are You?";
    }
}
