package Arrays;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.print("Phy :");
        marks[0] = sc.nextInt();
        System.out.print("Chem :" );
        marks[1] = sc.nextInt();
        System.out.print("Math :" );
        marks[2] = sc.nextInt();

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("percentage is :" + percentage + "%");

        System.out.println("length is :" +marks.length);
    }       
}
