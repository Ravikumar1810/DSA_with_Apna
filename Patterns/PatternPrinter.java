package Patterns;

public class PatternPrinter {
    public static void main(String[] args) {
        int start = 0;
        int increment = 5;
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = start + increment;
            System.out.println(start + " + " + increment + " = " + sum);
            start = sum;
            increment += 10; 
        }

       
        double result = (double) sum / 5;
        System.out.println(sum + " / 5 = " + result);
    }
}