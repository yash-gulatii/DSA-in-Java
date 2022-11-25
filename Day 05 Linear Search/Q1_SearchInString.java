public class Q1_SearchInString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(searchInString(name,target));
    }

    static boolean search2InString(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch:str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchInString(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
