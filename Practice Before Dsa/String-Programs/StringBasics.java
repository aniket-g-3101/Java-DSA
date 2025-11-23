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

    }
}
