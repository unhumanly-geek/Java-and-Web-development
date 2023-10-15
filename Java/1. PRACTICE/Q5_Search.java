import java.util.Scanner;

public class Q5_Search {

    static void search(int[][] arr, int x, int y, int n) {

        boolean flag = false;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (n == arr[i][j]) {
                    flag = true;

                }
            }
        }
        if (flag) {
            System.out.println("Element is here");

        } else {
            System.out.println("not found");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter for x Axis");
        int x = sc.nextInt();
        System.out.println("Enter for y Axis");
        int y = sc.nextInt();
        System.out.println("Enter to find");
        int n = sc.nextInt();

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        search(arr, x, y, n);

    }
}
