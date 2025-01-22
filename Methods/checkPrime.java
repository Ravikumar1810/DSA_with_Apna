package Methods;

public class checkPrime {
    
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
    
        for(int i =2; i<=n-1; i++) { //We can use optimized approach here using Marh.sqrt(n)
            if(n % i == 0) {   //completly divisible
                return  false;
            }

        }
        return  true;
    }

    public static void main(String[] args) {
        
        System.out.println(isPrime(11));
    }
    
}
