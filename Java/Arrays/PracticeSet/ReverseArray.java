package PracticeSet;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");

        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int[] revArr = new int[len];

        for (int i = 0; i < len; i++) {
            revArr[i] = arr[len - i - 1];
        }

        for (int i = 0; i < len; i++) {
            System.out.println(revArr[i]);
        }

    }

}