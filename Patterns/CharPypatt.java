package Patterns;

public class CharPypatt {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
         
        //outer loop
        for (int i = 1; i <=n; i++) {
            //inner loop
            for(int j = 1; j <=i; j++) {
                System.out.print(ch);  //A 
                ch++;           // Character increment
            }
            System.err.println();  //new line

        }
    }
}
