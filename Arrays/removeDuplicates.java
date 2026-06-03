// Approach (Two Pointer Technique)
// Since the array is already sorted, all duplicate elements will appear next to each other.
// Initialize a pointer k = 1 to track the position where the next unique element should be placed.
// Traverse the array from index 1 to n-1:
// If the current element is different from the previous element, it is a unique element.
// Place it at index k.
// Increment k.
// After the traversal, the first k positions of the array contain all unique elements in sorted order.
// Return k, which represents the number of unique elements.
//Time Complexity = O(n)
//Space Complexity = O(1)

import java.util.*;

public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1])  {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements :");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int uniqueElements = removeDuplicates(nums);
        System.out.println("Number of unique elements : " + uniqueElements);
        sc.close();
    }
}
