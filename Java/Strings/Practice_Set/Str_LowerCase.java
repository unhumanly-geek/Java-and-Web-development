package Strings.Practice_Set;

import java.util.Scanner;

public class Str_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.print("Enter: ");
        String k = sc.nextLine();
        String tlc = k.toLowerCase();

        System.out.println("Lowercase: "+tlc);
    }
    
}
