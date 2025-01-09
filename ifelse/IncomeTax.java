package ifelse;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        System.err.print("Enter the income :");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income <= 250000) {
            tax = 0;
        } else if(income <= 500000 && income> 2500000) {
            tax = (int) (income * 0.20);
        } else {
            tax = (int) (income * 0.30);
        }

        System.out.println("Tax is: " + tax);
    }
}
