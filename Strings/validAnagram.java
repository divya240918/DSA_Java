package Strings;
import java.util.Scanner;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int num = 0; num < count.length ;num++) {
            if(count[num] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s = sc.next();
        System.out.println("Enter second string : ");
        String t = sc.next();

        validAnagram obj = new validAnagram();
        boolean anagram = obj.isAnagram(s,t);

        if(anagram) {
            System.out.println("Given strings are anagrams");
        } else {
            System.out.println("Given numbers are not anagrams");
        }
    }
}
