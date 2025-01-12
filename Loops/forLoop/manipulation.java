package Loops.forLoop;
//multiplication table of a number N

import java.util.Scanner;

class manipulation {
    public static void PrintmultiplicationTable(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        // int n = sc.nextInt();

        for(int i =1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        PrintmultiplicationTable(6);
    }
}
