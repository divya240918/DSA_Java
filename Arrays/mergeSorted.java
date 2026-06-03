
// Approach:
// Since nums1 already has enough space (size = m + n),
// we start filling the array from the end to avoid overwriting
// the existing elements of nums1.
//
// 1. Initialize three pointers:
//    i -> last valid element of nums1 (m - 1)
//    j -> last element of nums2 (n - 1)
//    k -> last index of nums1 (m + n - 1)
//
// 2. Compare nums1[i] and nums2[j].
//    Place the larger element at nums1[k].
//
// 3. Move the corresponding pointer (i or j) and decrement k.
//
// 4. Repeat until one of the arrays is exhausted.
//
// 5. If elements are still left in nums2,
//    copy them to nums1.
//
// 6. No need to copy remaining elements of nums1 because
//    they are already in their correct positions.
//
// Time Complexity: O(m + n)
// Space Complexity: O(1)
 
import java.util.Scanner;

public class mergeSorted {
    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // to handle the case where all elements of nums1 are iterated but there are
        // still some elements in nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        return nums1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of valid elements in 1st array : ");
        int m = sc.nextInt();

        System.out.println("Enter the number of elements in 2nd array : ");
        int n = sc.nextInt();

        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];

        System.out.println("Enter " + m + " elements of 1st array");
        for(int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter " + m + " elements of 2nd array");
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeSortedArray(nums1, m, nums2, n);

        System.out.println("Merged Array : ");
        for(int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        sc.close();
    }
}
