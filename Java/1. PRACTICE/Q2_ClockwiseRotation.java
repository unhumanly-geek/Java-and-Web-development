import java.util.Scanner;

public class Q2_ClockwiseRotation {
    static void ClockwiseRotation(int[] arr, int x, int r) {
        int[] temp = new int [x];

        for(int i =0; i<x; i++){
            temp[i]=arr[x-i+1];
        }




    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int x = sc.nextInt();

        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter Element for index: " + i);
            arr[i] = sc.nextInt();

        }
        System.out.println("Rotation number: ");
        int r = sc.nextInt();

        ClockwiseRotation(arr, x, r);
    }

}
