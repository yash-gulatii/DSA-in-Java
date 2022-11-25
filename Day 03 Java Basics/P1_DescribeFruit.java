import java.util.Scanner;

public class P1_DescribeFruit {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String fruit = in.next();
        String fruit2 = fruit.toLowerCase();

        switch (fruit2) {
            case "mango" -> System.out.println("King of Fruit");
            case "banana" -> System.out.println("Minion's Favourite");
            case "apple" -> System.out.println("A Sweet Red Fruit");
            case "orange" -> System.out.println("Nice Colour");
            default -> System.out.println("No Fruit");
        }
    }
}
