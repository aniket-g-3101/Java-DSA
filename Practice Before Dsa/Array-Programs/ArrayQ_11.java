
// 11.Find the second smallest element

import java.util.Scanner;

public class ArrayQ_11 {
    public static void main(String args[]) {
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

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num > min1 && num < min2) {
                min2 = num;
            }
        }

        if (min2 == Integer.MAX_VALUE) {
            System.out.println("\nNo second smallest element (all elements same).");
        } else {
            System.out.println("\nSecond smallest element is: " + min2);
        }
        sc.close();
    }
}
