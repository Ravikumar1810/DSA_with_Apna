package Loops.forLoop;

public class RevaerseNum1 {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;

        while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println ("The reverse number is : " + rev);

    }
}
