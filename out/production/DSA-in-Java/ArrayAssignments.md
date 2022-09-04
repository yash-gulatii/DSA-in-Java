# Array Assignments

## Day 1 - 5 September 2022

### Question 1 (Easy) - [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)

### Answer 1 -
### For Intellij
```java

import java.util.Arrays;

public class Q1_BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
             ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

```
### For LeetCode
```java
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
             ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
```

### Question 2 (Easy) - [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)

### Answer 2 -
### For Intellij:
```java

import java.util.Arrays;

public class Q2_ConcatnationofArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = concatArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] concatArray(int[] nums) {
        int n = nums.length;
        int[] a = new int[n*2];
        for (int i = 0; i < n; i++) {
            a[i] = nums[i];
            a[i+n] = nums[i];
        }
        return a;
    }
}


```
### For LeetCode:
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] a = new int[n*2];
        for (int i = 0; i < n; i++) {
            a[i] = nums[i];
            a[i+n] = nums[i];
        }
        return a;
    }
}
```