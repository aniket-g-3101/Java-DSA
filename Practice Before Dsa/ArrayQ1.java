//1.Find the sum of all elements in an array

import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of Array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // The line `int sum = 0;` is initializing a variable `sum` of type `int` with
        // an initial value of 0.
        // This variable `sum` is used to store the sum of all elements in the array.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\nSum of Elements is : " + sum);
        sc.close();
    }
}
