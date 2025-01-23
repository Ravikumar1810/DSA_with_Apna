package Methods;

public class floyd_Tri {
    
    public static void floyds_Triangle(int n) {
        int counter = 1;

        for(int i = 1; i<= n; i++) {

            //inner loop
            for(int j = 1; j<=i; j++) {
                System.out.print(counter +" ");
                counter++;
            }

            System.out.println( );
        }
    }

    public static void main(String[] args) {
        floyds_Triangle(5);
    }
}
