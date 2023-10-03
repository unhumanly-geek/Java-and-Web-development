import java.util.*;

public class tut27_for_each_loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Provide length: ");
        int alen = sc.nextInt();

        int[] marks = new int[alen];
        System.out.println("Given length: " + marks.length);

        int a;

        for (int i = 0; i < alen; i++) {
            a = sc.nextInt();
            marks[i] = a;

        }
        for (int i = 0; i < alen; i++) {
            System.out.println(marks[i]);

        }

    }
}
