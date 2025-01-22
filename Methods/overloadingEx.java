package Methods;

public class overloadingEx {
    
    //function to call sum of 2 number
    public static int sum(int a, int b) {
        return a+b;
    }
    
    //function to call sum of 3 number
    public static int sum(int a , int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 56));
        System.out.println(sum(23, 45, 67));
    }

}
