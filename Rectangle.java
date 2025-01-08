
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the recatangle:");
        int length = sc.nextInt();

        System.out.println("Enter the width of the recctangle:");
        int width = sc.nextInt();

        int area = length * width;

        System.out.println("Area of the rectangle is:" + area);
        sc.close();
    }
}
