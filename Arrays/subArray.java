// # Maximum Subarray

// ## Approach

// Used Kadane's Algorithm to find the maximum sum subarray in a single traversal.

// - `currentSum` stores the maximum subarray sum ending at the current index.
// - For each element, either:
//   - start a new subarray from the current element, or
//   - extend the previous subarray.
// - `maxSum` keeps track of the largest sum found so far.
// - Return `maxSum` at the end.

// ## Logic

// ```java
// currentSum = Math.max(nums[i], currentSum + nums[i]);
// maxSum = Math.max(maxSum, currentSum);

//Time Complexity = O(n)
//Space Complexity = O(1)

import java.util.Scanner;
public class subArray {
    public static int subArrayWithMaxSum (int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum+nums[i]);

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxSum = subArrayWithMaxSum(nums);

        System.out.println(maxSum);
    }
}
