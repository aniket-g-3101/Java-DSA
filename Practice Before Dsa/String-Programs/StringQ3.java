// 3.Reverse a string

import java.util.Scanner;

public class StringQ3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String str = sc.nextLine();
        System.out.println("Original String : " + str);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String : " + rev);
        sc.close();
    }
}
