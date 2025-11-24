// 3.Write a function to check if a number is prime

import java.util.Scanner;

public class FunctionQ3 {

    public static void IsPrime(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                // This part of the code is checking if the number `n` is divisible by `i`
                // without any
                // remainder. If `n` is divisible by `i` without any remainder, then `n` is not
                // a prime
                // number because prime numbers are only divisible by 1 and themselves. So, if
                // `n` is
                // divisible by `i`, the `isPrime` flag is set to `false` indicating that `n` is
                // not a
                // prime number, and the loop is exited using the `break` statement.
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        IsPrime(num);
        sc.close();
    }
}
