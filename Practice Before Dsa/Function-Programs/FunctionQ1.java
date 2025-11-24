// 1.Write a function to find factorial of a number

import java.util.Scanner;

public class FunctionQ1 {
    public static void fact(int n) {
        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            // The code snippet `int fact = 1;` initializes a variable `fact` to 1.
            int fact = 1;
            // The code snippet `for (int i = 2; i <= n; i++) { fact *= i;` is a for loop
            // that iterates
            // from 2 to the input number `n`. In each iteration, it multiplies the current
            // value of
            // `fact` by the loop variable `i`. This effectively calculates the factorial of
            // the input
            // number `n`.
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