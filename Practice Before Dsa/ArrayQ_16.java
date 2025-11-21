// 16.Print array elements in reverse order

import java.util.Scanner;

public class ArrayQ_16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Origianl Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray in Reversed Order : ");
        // This part of the code is responsible for printing the elements of the array
        // in reverse order.
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
