//Function - Function is a block of statements which gives desired output after its execution
// Used to organize code and reuse logic.
// in java the main() function has more priority than other functions 

import java.util.Scanner;

public class Functions {

    // Use `static` for calling methods without objects.
    // if u dont use static keyword then u have to create object of class to access
    // it

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Function to add two numbers
        Scanner sc = new Scanner(System.in);
        // declare two numbers
        int num1;
        int num2;

        // take input from user
        System.out.println("Enter First Number : ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        num2 = sc.nextInt();
        sc.close();
        // call the function by its name

        int result = add(num1, num2);

        System.out.println("Addition is :" + result);

    }
}
