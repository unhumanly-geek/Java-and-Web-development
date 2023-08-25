import java.util.Scanner;

public class Q8_Palindrome {

    public static String RevStr(String str) {
        String RStr = "";

        for (int i = 0; i < str.length(); i++) {
            RStr = RStr + str.charAt(str.length() - i - 1);

        }
        return(RStr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if (RevStr(str).equals(str)) {
            System.out.println("Its a palindrome");
            
        }
        else{
            System.out.println("Not a palindrome");
        }

    }

}
