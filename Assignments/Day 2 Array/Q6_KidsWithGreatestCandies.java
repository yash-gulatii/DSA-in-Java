import java.util.*;

public class Q6_KidsWithGreatestCandies {

    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));
        int sum = 0;

        for (int i = 0; i < candies.length; i++) {
            sum = candies[i] + extraCandies;
            boolean ans1 = true;
            for (int candy : candies) {
               if (sum >= candy){
                   ans1 = ans1 && true;
               }
               else {
                   ans1 = ans1 && false;
               }
            }
            ans.set(i,ans1);
        }

        return ans;
    }
}


//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> ans = new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));
//        int sum = 0;
//
//        for (int i = 0; i < candies.length; i++) {
//            sum = candies[i] + extraCandies;
//            boolean ans1 = true;
//            for (int candy : candies) {
//                if (sum >= candy){
//                    ans1 = ans1 && true;
//                }
//                else {
//                    ans1 = ans1 && false;
//                }
//            }
//            ans.set(i,ans1);
//        }
//
//        return ans;
//    }
//
//}