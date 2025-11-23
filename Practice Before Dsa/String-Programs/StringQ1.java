// 1.Check if a string is palindrome

import java.util.Scanner;

public class StringQ1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String palindrome = sc.next();

        StringBuilder sb = new StringBuilder(palindrome);
        String reverse = sb.reverse().toString();

        if (palindrome.equals(reverse)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}
