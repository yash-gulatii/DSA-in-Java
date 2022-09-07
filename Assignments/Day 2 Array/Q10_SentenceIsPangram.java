public class Q10_SentenceIsPangram {
    public static void main(String[] args) {
      String  sentence = "thequickbrownfoxjumpsoverthelazydog";
      boolean ans = checkIfPangram(sentence);
        System.out.println(ans);

    }

    static boolean checkIfPangram(String sentence){
        int[] count = new int[26];
        char[] ch = sentence.toCharArray();
        if (ch.length<26){
            return false;
        }else {
            for (int i = 0; i < ch.length; i++) {
                count[ch[i]-'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i]==0){
                return false;
            }
        }
        return true;
    }
}

//class Solution {
//    public boolean checkIfPangram(String sentence) {
//        int[] count = new int[26];
//        char[] ch = sentence.toCharArray();
//        if (ch.length<26){
//            return false;
//        }else {
//            for (int i = 0; i < ch.length; i++) {
//                count[ch[i]-'a']++;
//            }
//        }
//        for (int i = 0; i < 26; i++) {
//            if (count[i]==0){
//                return false;
//            }
//        }
//        return true;
//    }
//}