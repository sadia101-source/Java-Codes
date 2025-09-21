package week_7;

import java.util.Scanner;
public class anagram {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] str2Chars = str2.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;
            for (int j = 0; j < str2Chars.length; j++){
                if (ch == str2Chars[j]) {
                    str2Chars[j] = '0';
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = scan.nextLine();

        System.out.print("Enter second string: ");
        String second = scan.nextLine();

        scan.close();
        
        if (areAnagrams(first, second)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
