package Methods;

public class solid_rhombus {
    
    public static void solid_rhombus_pattern(int n) {
        //outer loop
        for (int i = 1; i<=n; i++) {
            //Space
            for(int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        solid_rhombus_pattern(6);
    }
}
