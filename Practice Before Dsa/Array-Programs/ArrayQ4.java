
//4.Count how many even numbers are in an array

import java.util.Scanner;

public class ArrayQ4 {
    public static void main(String args[]) {

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
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        System.out.println("\nTotal Even Numbers in Array are :" + count);
        sc.close();
    }

}
