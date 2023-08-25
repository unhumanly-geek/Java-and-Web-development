import java.util.Scanner;

public class Q11_StringPALINDROME {

    static void palindrome(String str) {

        String RStr = "";

        for (int i = 0; i < str.length(); i++) {
            RStr = RStr + str.charAt(str.length() - i - 1);
        }
        if (RStr.equals(str)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        palindrome(str);
    }
}
