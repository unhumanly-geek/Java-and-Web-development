import java.util.Scanner;

public class Q4_Reverse {

    public static void RevArr(int[] arr, int x){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        RevArr(arr, x);

    }


    
}
