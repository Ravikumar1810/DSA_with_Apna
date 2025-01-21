package methods;

public class Binomial {
    public static int binCoff (int n, int r) {
        int fact_n = factorial(  n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoff = fact_n / (fact_r * fact_nmr);
        return binCoff;
   
    }

    public static void main(String[] args) {
        System.out.println(binCoff(5, 7 ));
    }
}
