package methods;

public class inverted_rotated_patt {
    
    public static void inv_rotate_pattern(int n) {
        //outer loop
        for (int i = 1; i<=n; i++) {


            // print space 
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }

             //print star
            for(int j = 1; j<= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        inv_rotate_pattern(5);
    }
}
