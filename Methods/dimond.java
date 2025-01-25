package Methods;

public class dimond {
    
    public static void daimond_pattern(int n) {
        //outer loop
        for(int i = 1; i<=n; i++) { //outer loop start from 1 to n

            //space
            for(int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            for(int j= 1; j<= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        for(int i =n; i>=1; i--) {  //inner loop satart from n to 1 and decrement

            //space
            for(int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            for(int j= 1; j<= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        daimond_pattern(7);
    }
}
