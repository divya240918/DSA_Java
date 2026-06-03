// Approach (Boyer-Moore Voting Algorithm)
// Maintain two variables:
// candidate → potential majority element.
// count → vote count for the candidate.
// Traverse the array:
// If count == 0, make the current element the new candidate.
// If the current element is equal to candidate, increment count.
// Otherwise, decrement count.
// The idea is that every occurrence of a non-majority element cancels out one occurrence of the majority element.
// Since the majority element appears more than n/2 times, it cannot be completely canceled by all other elements. Therefore, the final candidate will be the majority element.
// Return the final candidate.
//Time Complexity = O(n)
//Space Complexity = O(1)

import java.util.Scanner;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int candidate = majorityElement(nums);
        System.out.println("Majority Element : " + candidate);
        sc.close();
    }
}
