import java.util.Scanner;

public class Q19_Duplicates {

    static void duplicate(int[] arr, int k) {

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[j]);

                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Enter elements for index " + i + ": ");
            arr[i] = sc.nextInt();

        }
        duplicate(arr, x);
    }

}
