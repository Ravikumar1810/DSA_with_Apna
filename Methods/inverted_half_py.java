package Methods;

public class inverted_half_py {
    
    public static void inverted_half_pyramid_num(int n) {
        for(int i = 1; i<=n; i++) {

            //inner loop
            for(int j =1; j <= n-i+1; j++) {
                System.out.print(j+ " ");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid_num(6);
    }
}
