
//2.Find the maximum element in an array

import java.util.Scanner;

public class ArrayQ2 {
    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements Of Array : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("Array is :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int max = arr[0]; // Start with first element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nMaximum Element of Array is : " + max);
        sc.close();
    }
}
