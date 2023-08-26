import java.util.Scanner;

public class Q2_ClockwiseRotation {
    static void ClockwiseRotation(int[] arr, int n, int d) {
        // create a new array to store the rotated elements
        int[] rotated = new int[n];
        // loop through the original array
        for (int i = 0; i < n; i++) {
            // calculate the new index for each element after rotation
            // use modulo operator to wrap around the array indices
            int newIndex = (i + d) % n;
            // copy the element to the new index in the rotated array
            rotated[newIndex] = arr[i];
        }
        // return the rotated array
        for (int i = 0; i < n; i++) {
            System.out.println(rotated[i]);

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
