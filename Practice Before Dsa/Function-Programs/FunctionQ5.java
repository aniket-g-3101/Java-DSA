// 5.Write a function to return the sum of digits of a number

import java.util.Scanner;

public class FunctionQ5 {
    // This Java function `DigitSum` calculates the sum of digits of a given number
    // `n`.
    public static int DigitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        int result = DigitSum(num);
        System.out.println("Sum of Digits : " + result);
        sc.close();
    }
}
