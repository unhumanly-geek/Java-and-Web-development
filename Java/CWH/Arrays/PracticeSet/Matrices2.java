package PracticeSet;

import java.util.*;

public class Matrices2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter for x axis: ");
        int xaxis = sc.nextInt();

        System.out.print("Enter for y axis: ");
        int yaxis = sc.nextInt();

        int[][] arr = new int[xaxis][yaxis];

        for(int i = 0; i<xaxis; i++){
            for(int j = 0; j<yaxis; j++){
                System.out.println("Enter for Value: "+i+j);
                arr[i][j]=sc.nextInt();

            }
            
        }
        for(int i = 0; i<xaxis; i++){
            for(int j = 0; j<yaxis; j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");

            }
            System.out.println("");

    }
}
}