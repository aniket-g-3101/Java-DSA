//8.Check if two strings are anagrams

import java.util.Scanner;

public class StringQ8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
        System.out.println("First String : " + str1);
        System.out.println("Second String : " + str2);

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            sc.close();
            return;
        }

        int freq[] = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        boolean isAnagram = true;

        for (int f : freq) {
            if (f != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Not an anagram");
        }
        sc.close();

    }

}
