// 9.Print characters with their ASCII values

// ASCII value is the numeric code that represents a character in the ASCII table.

import java.util.Scanner;

public class StringQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            System.out.println("Ascii value of " + ch + " : " + ascii);
        }
        sc.close();

    }

}
