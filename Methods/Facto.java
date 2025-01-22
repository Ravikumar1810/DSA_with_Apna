package Methods;

public class Facto {
    public static int factorial(int n) {
        int f =1;

        for(int i =1; i<=n; i++) {
            f = f* i;
            // System.out.println("tha factorial is :" +f );
        }

        return f;
    }

    public static void main(String[] args) {
        // factorial(6);
        System.out.println(factorial(7));
    }
}
