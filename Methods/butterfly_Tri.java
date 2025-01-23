package Methods;

public class butterfly_Tri {
    

    public static void butterfly_Triangle(int n) {
        //1st half
        for(int i = 1; i<= n; i++) {
            
            //print star - i
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            //print space - 2 * (n-i)
            for(int j =1; j<= 2*(n-i); j++) {
                System.out.print(" ");
            }

            //print star  - i
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
              
        }
         // 2nd half  
        for(int i = n; i>=1; i--){

           //print star - i
           for(int j = 1; j<=i; j++) {
             System.out.print("*");
          }

         //print space - 2 * (n-i)
         for(int j = 1; j <= 2 * (n-i); j++) {
            System.out.print(" ");
         }

         //print star  - i
          for(int j =1; j<=i; j++) {
            System.out.print("*");
         }

          System.out.println(" ");

        }

       
    }

    public static void main(String[] args) {
        butterfly_Triangle(6);
    }
}
