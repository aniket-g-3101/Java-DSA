// 9.Reverse an array

import java.util.Scanner;

public class ArrayQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // This part of the code is responsible for reversing the array. Here's how it
        // works:
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("\nReversed Array is ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
