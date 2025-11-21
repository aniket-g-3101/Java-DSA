// 15.Copy one array to another

import java.util.Scanner;

public class ArrayQ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int copy[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println("\nCopied Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
