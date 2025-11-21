
// 8.Search for a given element in an array

import java.util.Scanner;

public class ArrayQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        boolean found = false;
        int srch;
        System.out.println("\nEnter Search Value : ");
        srch = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (srch == arr[i]) {
                System.out.println("Element found at index :" + i);
                found = true;
            }
        }
        if (!found) {

            System.out.println("Element not found");
        }
        sc.close();
    }
}
