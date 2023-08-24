package PracticeSet;

import java.util.Arrays;
import java.util.Scanner;

public class sortedORnot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int [] arr = new int[len];
        int [] arr2 = (int[]) arr.clone();

        for(int i = 0; i<len; i++){
            arr[len]=sc.nextInt();
        }

    }

}
