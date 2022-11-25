public class Strings {
    public static void main(String[] args) {

        String a = "Kunal";
        String b = "Kunal";
        String c = a;

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

//        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
