import java.util.Scanner;

public class Q19_Duplicates {

    static void duplicate(int[] arr, int k){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        System.out.print("Enter Length: ");


        int []arr= new int[x]; 
        
        for(int i =0; i <x; i++){
            System.out.print("Enter elements for index "+i+": ");
            arr[i]=sc.nextInt();

        }
        duplicate(arr, x);
    }
    
}
