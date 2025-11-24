// 10.Reverse each word in a sentence

import java.util.Scanner;

public class StringQ_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String sentence = sc.nextLine();

        String words[] = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }

            result = result + rev + " ";
        }

        System.out.println("Reversed each word:");
        System.out.println(result.trim());

        sc.close();
    }
}
