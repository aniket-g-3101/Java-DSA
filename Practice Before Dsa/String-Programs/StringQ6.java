//6.Find the frequency of each character

import java.util.Scanner;

public class StringQ6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String str = sc.nextLine();
        System.out.println("Entered String : " + str);

        int freq[] = new int[256]; // covers all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequency:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
        sc.close();
    }

}
