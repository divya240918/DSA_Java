// Approach:
// Initially, I solved this problem using a brute force approach.
// The last element was stored in a temporary variable, all other
// elements were shifted one position to the right, and the stored
// element was placed at the first position. This process was
// repeated k times.
//
// However, the time complexity of this approach was O(n × k),
// which is inefficient for large values of k.
//
// Therefore, I used the reversal algorithm:
//
// 1. Reverse the entire array.
// 2. Reverse the first k elements.
// 3. Reverse the remaining n - k elements.
//
// A helper function reverse() was created to reverse any
// portion of the array using the two-pointer technique.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;
public class rotateArray {
    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the elements you want to rotate : ");
        int k = sc.nextInt();

        rotateArray(nums, k);
        System.out.println("Rotated Array : ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}
