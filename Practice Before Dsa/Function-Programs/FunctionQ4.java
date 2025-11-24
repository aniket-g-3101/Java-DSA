// 4.Write a function to find GCD of two numbers

import java.util.Scanner;

public class FunctionQ4 {
    public static void GCD(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
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
