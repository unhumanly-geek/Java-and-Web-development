package Methods_Recursion;

public class Method_Overloading {
    static void data(int x, int y, int z){
        System.out.println(x+y+z);

    }
    static void data(int x, int y){
        System.out.println(x+y);
    }
    static void data(int x){
        System.out.println(x);
    }
    static void data(){
        System.out.println("Enter Valid Data");
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        data(a, b, c);
        data(b, c);
        data(c);
        data();
    }
    
}
