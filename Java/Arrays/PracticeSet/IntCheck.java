package PracticeSet;

import java.util.Scanner;

public class IntCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 3, 4, 5, 6, 7 };

        System.out.println("Enter the number to search: ");
        int a = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                System.out.println("YES, FOUND AT: "+i);
                break;
                
            }
        }

    }

}
