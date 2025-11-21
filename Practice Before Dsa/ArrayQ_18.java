//18.Replace all negative numbers with 0

import java.util.Scanner;

public class ArrayQ_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // This part of the code is iterating through each element of the array `arr`.
        // For each element,
        // it checks if the value is less than 0 (negative). If the element is negative,
        // it replaces that
        // element with 0. This effectively replaces all negative numbers in the array
        // with 0.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println("\nNew Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
