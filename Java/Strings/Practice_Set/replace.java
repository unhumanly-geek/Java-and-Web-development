package Strings.Practice_Set;

import java.util.Scanner;

public class replace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.print("Enter: ");
        String k = sc.nextLine();
        
        k=k.replaceAll(" ", "_");
        System.out.println(k);
    }
    
}
