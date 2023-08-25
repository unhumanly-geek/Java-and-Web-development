import java.util.Scanner;

public class Q9_KthPosition {
    static void Position(int[]  arr, int x, int r){
        
        int i = 0;
        int j = r-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


        for(i=0; i<x; i++){
            System.out.print(arr[i]+" ");;
        }


    }
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int x = sc.nextInt();

        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter Element for index: " + i);
            arr[i] = sc.nextInt();

        }
        System.out.println("Rotation number: ");
        int r = sc.nextInt();

        Position(arr, x, r);
        }}
