import java.util.Scanner;

public class Q7_2SumQ {

    static void sum(int[] arr, int k) {

        for(int i =0; i<arr.length; i++){
            for(int j =1; j<arr.length; j++){
                if (arr[i]+arr[j]==k) {
                    System.out.printf("Sum found at Index %d and %d: ", i, j);
                    
                }
            }
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int x = sc.nextInt();

        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int k=sc.nextInt();
        sum(arr, k);

    }

}
