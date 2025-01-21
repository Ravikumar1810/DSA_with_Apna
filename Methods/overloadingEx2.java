package methods;

public class overloadingEx2 {
    
    //function to call int sum
    public  static int sum(int a, int b) {
        return a +b;
    }

    //function to call float sum
    public static float sum(float a, float b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(sum(4.5f , 7.6f));
    }
}
