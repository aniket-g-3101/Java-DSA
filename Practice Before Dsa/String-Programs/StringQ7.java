// 7.Count words in a sentence

import java.util.Scanner;

public class StringQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String str = sc.nextLine();
        System.out.println("Entered String : " + str);
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count += 1;
            }
        }
        System.out.println("Total words : " + count);
        sc.close();
    }

}
