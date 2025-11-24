// 2.Count vowels and consonants

import java.util.Scanner;

public class StringQ2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Original length of String : " + str.length());
        int len = str.length();
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowels += 1;
                len -= 1;
            }
        }
        System.out.println("Count of Vowels in String : " + vowels);
        System.out.println("Count of Consonants in String : " + len);
        sc.close();

    }
}
