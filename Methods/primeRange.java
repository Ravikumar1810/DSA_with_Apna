package Methods;

public class primeRange {

    // Method to print in a range
    public static boolean isPrime(int num) {
        if (num <= 1) 
        return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
            return false; // Divisible by any number other than 1 and itself
        }
        return true;
    }

    // Method to print primes in a range
    public static void primesInRange(int n) {
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        primesInRange(27); 
    }
}
