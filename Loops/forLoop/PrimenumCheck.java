package Loops.forLoop;

import java.util.Scanner;

public class PrimenumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime == true) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}
