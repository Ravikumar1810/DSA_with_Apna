package Methods;

import java.util.Scanner;

public class ProgWithParam {

    public static  int SumNumber(int num1 , int num2) {
        int sum = num1 + num2;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number :");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number");
        int b = sc.nextInt();

        int sum = SumNumber(a, b);
        System.out.println("The sum is : " +sum );
    }
}
