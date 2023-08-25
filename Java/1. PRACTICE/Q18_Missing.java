import java.util.Scanner;

public class Q18_Missing {
    static void missing(int[] arr) {

        boolean flag = true;

        int k;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                flag = false;
                k = i;
                System.out.println("Missing element found: " + k);
                break;
            }
        }
        if (flag) {
            System.out.println("Missing element not found");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter for" + i + ": ");
            arr[i] = sc.nextInt();
        }
        missing(arr);

    }

}
