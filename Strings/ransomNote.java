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
