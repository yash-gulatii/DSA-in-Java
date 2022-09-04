# Day 1 Array Assignments

## Date - 5 September 2022

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

### Question 3 (Easy) - [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

### Answer 3 -
### For Intellij:
```java

import java.util.Arrays;

public class Q3_RunningSumofArray1D {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int sum = nums[0];
        int[] ans = new int[nums.length];
        ans[0] = sum;
        for (int i = 1; i < nums.length ; i++) {
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;

    }
}


```
### For LeetCode:
```java
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        int[] ans = new int[nums.length];
        ans[0] = sum;
        for (int i = 1; i < nums.length ; i++) {
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;
    }
}
```


### Question 4 (Easy) - [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)

### Answer 4 -
### For Intellij:
```java

public class Q4_MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {


        int maxSum = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowSum = 0;
            for (int a : account) {
                rowSum = rowSum + a;
            }

            if(maxSum < rowSum){
                maxSum = rowSum;
            }
        }

        return maxSum;

    }

}


```
### For LeetCode:
```java

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowSum = 0;
            for (int a : account) {
                rowSum = rowSum + a;
            }

            if(maxSum < rowSum){
                maxSum = rowSum;
            }
        }

        return maxSum;
    }
}
```


### Question 5 (Easy) - [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)

### Answer 5 -
### For Intellij:
```java
import java.util.Arrays;

public class Q5_ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = 2;
        int[] ans = optimisedShuffleArray(nums,n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffleArray(int[] nums, int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            a[i] = nums[i];
            b[i] = nums[n+i];
        }

        for (int i = 0; i < nums.length; ) {
            for (int j = 0; j < n;j++) {
                ans[i] = a[j];
                ans[i+1] = b[j];
                i += 2;
            }
        }

        return ans;

    }

    static int[] optimisedShuffleArray(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if (i%2==0){
                arr[i]=nums[i/2];
            }else{
                arr[i]=nums[(nums.length+i-1)/2];
            }
        }
        return arr;

    }


}

```
### For LeetCode:
```java

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            a[i] = nums[i];
            b[i] = nums[n+i];
        }

        for (int i = 0; i < nums.length; ) {
            for (int j = 0; j < n;j++) {
                ans[i] = a[j];
                ans[i+1] = b[j];
                i += 2;
            }
        }

        return ans;
    }
}
```