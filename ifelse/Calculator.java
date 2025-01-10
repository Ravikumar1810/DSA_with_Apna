package ifelse;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the frist number :");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second number :");
        int num2 = sc.nextInt();

        System.err.println("Enter the operator :");;

        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println(num1 + num2);
                       break;

            case '-' : System.out.println(num1 - num2);
                       break;

            case '*' : System.out.println(num1 * num2);
                        break;

            case '/' : System.out.println(num1 / num2);
                        break;

            default: System.out.println("Invalid operator");
        }

        sc.close();
           
    }


}
