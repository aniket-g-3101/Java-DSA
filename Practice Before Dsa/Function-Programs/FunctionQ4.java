// 4.Write a function to find GCD of two numbers

import java.util.Scanner;

public class FunctionQ4 {
    public static void GCD(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            // The `if (a % i == 0 && b % i == 0)` condition checks if both `a` and `b` are
            // divisible
            // by the current value of `i` without any remainder. If this condition is true,
            // it means
            // that `i` is a common factor of both `a` and `b`, and in that case, `gcd` is
            // updated to
            // the current value of `i`. This process continues until the loop reaches the
            // minimum of
            // `a` and `b`, and the final value of `gcd` will be the greatest common divisor
            // of `a` and
            // `b`.
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD is: " + gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        GCD(num1, num2);
        sc.close();
    }
}
