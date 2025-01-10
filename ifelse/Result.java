package ifelse;

import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int marks = sc.nextInt();

        String  result = marks >= 40 ? "pass" : "fail";

        System.out.println("Result is " + result);
    }
}
