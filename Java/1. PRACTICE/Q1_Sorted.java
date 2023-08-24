import java.util.*;

public class Q1_Sorted {

    public static void sorter(int[] arr, int x) {

        int[] arr2 = new int[x];

        for (int i = 0; i < x; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);

        boolean flag = true;

        for (int i = 0; i < x; i++) {
            if (arr[i] == arr2[i]) {
                flag = false;

            }
        }
        if (flag) {
            System.out.println("UNSorted");

        } else {
            System.out.println("Sorted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        sorter(arr, x);

    }

}
