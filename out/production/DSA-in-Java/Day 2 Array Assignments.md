# Day 2 Array Assignments

## Date - 7 September 2022

### Question 6 (Easy) - [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

### Answer 6 -
### For Intellij
```java

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

```
### For LeetCode
```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
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
```

### Question 7 (Easy) - [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)

### Answer 7 -
### For Intellij:
```java

public class Q7_NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int ans = pairs(nums);
        System.out.println(ans);
    }

    static int pairs(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i<j){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}


```
### For LeetCode:
```java

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i<j){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
}
```

### Question 8 (Easy) - [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

### Answer 8 -
### For Intellij:
```java

import java.util.Arrays;

public class Q8_NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[]  nums = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbers(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbers(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;


    }
}



```
### For LeetCode:
```java

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}

}
```


### Question 9 (Easy) - [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/10

### Answer 9 -
### For Intellij:
```java

import java.util.Arrays;

public class Q9_TargetArrayinGivenOrder {
    public static void main(String[] args) {
        int[] nums = {1};
        int[] index = {0};
        int[] ans = createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums,int[] index){
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(index[i] == i)
                ans[index[i]] = nums[i];
            else{
                for(int j = nums.length -1; j > index[i]; j--)
                    ans[j] = ans[j-1];
                ans[index[i]] = nums[i];
            }

        }

        return ans;

    }
}




```
### For LeetCode:
```java


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(index[i] == i)
                ans[index[i]] = nums[i];
            else{
                for(int j = nums.length -1; j > index[i]; j--)
                    ans[j] = ans[j-1];
                ans[index[i]] = nums[i];
            }

        }

        return ans;
    }
}
}
```


### Question 10 (Easy) - [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)

### Answer 10 -
### For Intellij:
```java
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

```
### For LeetCode:
```java

class Solution {
    public boolean checkIfPangram(String sentence) {
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
}
```