package Methods;

public class hallow_rhombus {
    
    public static void hallow_rhombus_pattern(int n) {
        //outer loop

        for (int i = 1; i<=n; i++) {
            //Space 
            for(int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //Start
            for(int j =1; j<=n; j++) {

                if(i == n || j==n || j==1 || i==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
          System.out.println(""); 
        }
    }

    public static void main(String[] args) {
        hallow_rhombus_pattern(7);
    }
}
