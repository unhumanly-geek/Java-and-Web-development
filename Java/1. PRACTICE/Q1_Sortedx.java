import java.util.*;

public class Q1_Sortedx {

    public static void sortArray(int[] inputArray) {

        int[] arrCopy = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            arrCopy[i] = inputArray[i];
        }
        Arrays.sort(arrCopy);

        boolean flag = true;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != arrCopy[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Sorted");
        } else {
            System.out.println("UNSorted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int arraySize = sc.nextInt();

        int[] inputArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }

        sortArray(inputArray);
    }
}
