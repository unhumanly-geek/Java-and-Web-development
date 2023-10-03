package PracticeSet;

import java.util.Scanner;

public class SumOfFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Array: ");
        int len = sc.nextInt();

        float k;
        float[] arr = new float[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter" + i + "Element: ");
            k = sc.nextFloat();
            arr[i] = k;
        }
        float add = 0;
        for (int j = 0; j < len; j++) {
            add = arr[j] + add;
        }
        System.out.println("Total sum:" + add);

    }

}