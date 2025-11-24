// 2.Write a function to generate Fibonacci up to n terms

import java.util.Scanner;

public class FunctionQ2 {

    public static void Program(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            // This part of the code is responsible for generating the next Fibonacci number
            // in the
            // sequence.
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        Program(num);
        sc.close();
    }
}
