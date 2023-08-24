package PracticeSet;

import java.util.Arrays;
import java.util.Scanner;

public class sortedORnot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Len: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = (int[]) arr.clone();
        Arrays.sort(arr2);

        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (arr[i] != arr2[i]) {
                flag = false;

            }
        }
        if (flag=true) {
            System.out.println("Array is sorted");
            
        }
        else{
            System.out.println("Unsorted");
        }

    }

}
