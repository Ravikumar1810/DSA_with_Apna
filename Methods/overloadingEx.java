package methods;

public class overloadingEx {
    
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(int a , int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 56));
        System.out.println(sum(23, 45, 67));
    }

}
