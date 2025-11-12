// Java is a high-level, object-oriented programming language developed by Sun Microsystems in 1995.
// It is mostly used for building desktop applications, web applications, Android apps and enterprise systems
// Remember - The program name and main class name must me same 

import java.util.*;

// Every Java file has a `class` and a `main()` method 
public class JavaSyntax {
    public static void main(String[] args) { // main method

        // Data types: int, double, boolean, char, String

        // declare variables
        int a = 10;
        String b = "Java Basics";
        Double c = 10.45;

        // `System.out.println()` for printing.

        System.out.println("Value of int a is : " + a);
        System.out.println("Value of String b is : " + b);
        System.out.println("Value of double c is : " + c);

        // To Take Input From USer Scanner class is used

        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Enter Value For i : ");
        i = sc.nextInt();
        System.out.println("Value of i is : " + i);
        sc.close();
    }

}
