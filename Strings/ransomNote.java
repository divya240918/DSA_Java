// #Approach:
// 1) Create a frequency array of size 26 to store
// the count of each lowercase character.
//
// 2) Traverse the magazine string and increment
// the frequency of each character.
//
// 3) Traverse the ransomNote string and decrement
// the frequency of each character.
//
// 4) If any frequency becomes negative, it means
// ransomNote requires more occurrences of that
// character than magazine provides, so return false.
//
// 5) If no frequency is negative, return true.


// #Time Complexity: O(m + n)
// m = length of magazine
// n = length of ransomNote

// #Space Complexity: O(1)

package Strings;

import java.util.Scanner;

public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for(int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            count[ransomNote.charAt(i) - 'a']--;
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransom string : ");
        String ransomNote = sc.next();
        System.out.println("Enter the magazine string : ");
        String magazine = sc.next();

        ransomNote obj = new ransomNote();
        boolean canConctrucString = obj.canConstruct(ransomNote, magazine);

        if(canConctrucString) {
            System.out.println(ransomNote + " can be constructed using " + magazine);
        } else {
            System.out.println(ransomNote + " cannot be constructed using " + magazine);
        }
        sc.close();
    }
}
