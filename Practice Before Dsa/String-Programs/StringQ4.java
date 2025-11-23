//4.Remove all spaces

import java.util.Scanner;

public class StringQ4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String str = sc.nextLine();
        System.out.println("Original String : " + str);
        String result = str.replace(" ", "");
        System.out.println("Spaces Removed : " + result);
        sc.close();
    }
}
