# Day 3 Array Assignments

## Date - 4 November 2022

### Question 11 (Easy) - [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)

### Answer 11 -
### For Intellij
```java

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

```
### For Leetcode
```java


class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
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

```


### Question 12 (Easy) - [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)

### Answer 12 -
### For Intellij
```java

public class Q12_HighestAltitude {
    public static void main(String[] args) {

        int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        int ans = altitudes(gain);
        System.out.println(ans);
    }

    static int altitudes(int[] gain){
        int n = gain.length;
        int[] altitudes = new int[n+1];
        altitudes[0] = 0;
        for (int i = 0; i < n ; i++) {
            altitudes[i+1] = altitudes[i] + gain[i];
        }
        return highestAltitude(altitudes);

    }

    static int highestAltitude(int[] altitudes){

        int highestAltitude = 0;

        for (int altitude : altitudes) {
            if (altitude > highestAltitude) {
                highestAltitude = altitude;
            }
        }


        return highestAltitude;
    }
}






```
### For Leetcode
```java



class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitudes = new int[n+1];
        altitudes[0] = 0;
        for (int i = 0; i < n ; i++) {
            altitudes[i+1] = altitudes[i] + gain[i];
        }
        return highestAltitude(altitudes);
    }

    public int highestAltitude(int[] altitudes){

        int highestAltitude = 0;

        for (int altitude : altitudes) {
            if (altitude > highestAltitude) {
                highestAltitude = altitude;
            }
        }


        return highestAltitude;
    }
}

```


### Question 13 (Easy) - [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)

### Answer 13 -
### For Intellij
```java

import java.util.Arrays;

public class Q13_FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int n = image.length;
        int[][] ans = reverseArray(image,n);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] reverseArray(int[][] image, int n){
        int[][] reverseArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n-1;
            while (start<=end){
                reverseArray[i][start] = image[i][end];
                reverseArray[i][end] = image[i][start];
                start++;
                end--;
            }
        }

        return invertArray(reverseArray,n);
    }

    static int[][] invertArray(int[][] reverseArray, int n){
        int[][] invertArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (reverseArray[i][j] == 1){
                    invertArray[i][j] = 0;
                } else if (reverseArray[i][j] == 0) {
                    invertArray[i][j] = 1;
                }
            }
        }

        return invertArray;


    }
}


```
### For Leetcode
```java


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] reverseArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n-1;
            while (start<=end){
                reverseArray[i][start] = image[i][end];
                reverseArray[i][end] = image[i][start];
                start++;
                end--;
            }
        }

        return invertArray(reverseArray,n);
    }

    public int[][] invertArray(int[][] reverseArray, int n){
        int[][] invertArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (reverseArray[i][j] == 1){
                    invertArray[i][j] = 0;
                } else if (reverseArray[i][j] == 0) {
                    invertArray[i][j] = 1;
                }
            }
        }

        return invertArray;


    }
}


```
