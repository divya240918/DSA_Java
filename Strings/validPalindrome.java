// # Approach

// 1. Initialize two pointers, `start` at the beginning of the string and `end` at the last index.
// 2. Run a loop until `start` becomes greater than or equal to `end`.
// 3. If the character at `start` is not alphanumeric, skip it by incrementing `start`.
// 4. If the character at `end` is not alphanumeric, skip it by decrementing `end`.
// 5. Compare the lowercase versions of the characters at `start` and `end`.
// 6. If the characters are different, the string is not a valid palindrome, so return `false`.
// 7. If the characters are the same, move both pointers towards the center.
// 8. If the loop completes without finding any mismatch, return `true`.

// # Time Complexity

// O(n)

// Each character is visited at most once by either pointer.

// # Space Complexity

// O(1)


package Strings;

import java.util.Scanner;

public class validPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() -1;

        while(start < end) {
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        validPalindrome obj = new validPalindrome();
        boolean Palindrome = obj.isPalindrome(s);

        if(Palindrome) {
            System.out.println(s + " is a valid palindrome");
        } else {
            System.out.println(s + " is not a valid palindrome");
        }

        sc.close();

        
    }
}
