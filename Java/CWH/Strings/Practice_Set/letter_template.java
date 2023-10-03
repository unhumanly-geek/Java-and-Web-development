package Strings.Practice_Set;

import java.util.Scanner;

public class letter_template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.print(String.format("Dear %s, Thanks a lot",s));
    }
    
}
