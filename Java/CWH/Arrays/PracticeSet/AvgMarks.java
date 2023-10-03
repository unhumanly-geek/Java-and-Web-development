package PracticeSet;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Students: ");
        int len = sc.nextInt();

        int[] marks = new int[len];

        for (int i = 0; i < len; i++) {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += marks[i];
        }
        System.out.println((double) sum / len); // use double division to get accurate average
    }
}

