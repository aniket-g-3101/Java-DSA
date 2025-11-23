import java.util.Scanner;

public class StringBasics {
    public static void main(String args[]) {
        // Define the String
        String name = "Aniket";
        System.out.println(name);

        // To take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String user = sc.nextLine();
        System.out.println("Entered String : " + user);
        sc.close();

        // joining two strings together (Concatenation of Strings)

        String FristName = "Aniket";
        String LastName = " Gavali";
        String FullName = FristName + LastName;
        System.out.println(FullName);

        // Calculating length of String

        String n = "Aniket Gavali";
        System.out.println(n.length());

        // charAt() method - prints specified character at given index number

        for (int i = 0; i < n.length(); i++) {
            System.out.println("Character at index " + i + " : " + n.charAt(i));
        }
        // Output for above will be -

        // Character at index 0 : A
        // Character at index 1 : n
        // Character at index 2 : i
        // Character at index 3 : k
        // Character at index 4 : e
        // Character at index 5 : t
        // Character at index 6 :
        // Character at index 7 : G
        // Character at index 8 : a
        // Character at index 9 : v
        // Character at index 10 : a
        // Character at index 11 : l
        // Character at index 12 : i

        // comparing two strings -- compareTo() is used

        // compareTo () returns -
        // s1>s2 = +ve value
        // s1==s2 = 0
        // s1<s2 = -ve value

        String s1 = "Hello";
        String s2 = "Hello";
        if (s1.compareTo(s2) == 0) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

    }
}
