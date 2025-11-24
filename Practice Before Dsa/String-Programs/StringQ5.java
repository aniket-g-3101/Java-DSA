// 5.Convert lowercase to uppercase

import java.util.Scanner;

public class StringQ5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String str = sc.nextLine();
        System.out.println("Entered String : " + str);
        String result = str.toUpperCase();
        System.out.println("Updated String : " + result);
        sc.close();

    }
}
