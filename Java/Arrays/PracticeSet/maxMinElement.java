package PracticeSet;

import java.util.Arrays;
import java.util.Scanner;

public class maxMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int len = sc.nextInt();

        int [] arr = new int[len];

        for(int i = 0; i<len; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0; i < len; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Max ElementL: "+ arr[len-1]);
        System.out.println("Min ElementL: "+ arr[1]);
        
    }
    
}
