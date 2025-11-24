// 1.Write a function to find factorial of a number

import java.util.Scanner;

public class FunctionQ1 {
    public static void fact(int n) {
        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        fact(num);
        sc.close();
    }
}