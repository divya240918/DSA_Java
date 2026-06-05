package Strings;
import java.util.*;

public class firstUnique {
    public int firstUnique(String s) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for(int num = 0; num < s.length(); num++) {
            if(count[s.charAt(num) - 'a'] == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();

        firstUnique obj = new firstUnique();
        int firstUniqueElement = obj.firstUnique(s);

        System.out.println("First unique element occured at " + firstUniqueElement);
        sc.close();

        
    }
}
