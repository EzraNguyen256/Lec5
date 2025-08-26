package LEC6;

import java.util.Arrays;
import java.util.Scanner;

public class SortandSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter number to find: ");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The number " + num + " was found at index " + index);
        } else {
            System.out.println("Number not found.");
        }
    }
}
