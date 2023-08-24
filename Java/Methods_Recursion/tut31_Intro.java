package Methods_Recursion;

import java.util.Scanner;

public class tut31_Intro {
    static int logic(int x, int y){
         return x+y;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int x = sc.nextInt();

        int c = logic(k, x);

        System.out.println(c);
    }
    
}
