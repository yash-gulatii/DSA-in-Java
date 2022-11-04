import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Q11_CountMacthingRule {
    public static void main(String[] args) {
        List<List<String>> items=new ArrayList<List<String>>();
        List<String> list1=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        List<String> list3=new ArrayList<String>();

        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");

        list2.add("computer");
        list2.add("silver");
        list2.add("phone");

        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");

        items.add(list1);
        items.add(list2);
        items.add(list3);

        String ruleKey = "type";
        String ruleValue = "phone";
        int ans = matchingRule(items,ruleKey,ruleValue);
        System.out.println(ans);


    }

    static int matchingRule(List<List<String>> items,String ruleKey, String ruleValue){
        int rulekey = -1;

        if (Objects.equals(ruleKey, "type")){
            rulekey = 0;
        } else if (Objects.equals(ruleKey,"color")) {
            rulekey = 1;
        } else if (Objects.equals(ruleKey,"name")) {
            rulekey = 2;
        }

        int count = 0;

        for (List<String> item : items) {
            for (int j = 0; j < 3; j++) {
                if (Objects.equals(item.get(rulekey), ruleValue)) {
                    count++;
                    break;
                }
            }
        }


        return count;
    }

}
//
//
//class Solution {
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int rulekey = -1;
//
//        if (Objects.equals(ruleKey, "type")){
//            rulekey = 0;
//        } else if (Objects.equals(ruleKey,"color")) {
//            rulekey = 1;
//        } else if (Objects.equals(ruleKey,"name")) {
//            rulekey = 2;
//        }
//
//        int count = 0;
//
//        for (List<String> item : items) {
//            for (int j = 0; j < 3; j++) {
//                if (Objects.equals(item.get(rulekey), ruleValue)) {
//                    count++;
//                    break;
//                }
//            }
//        }
//
//
//        return count;
//    }
//}