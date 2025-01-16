package methods;

public class Product {

    public static int Multiple(int a , int b) {
        int Product = a * b;
        return Product;
    }
    public static void main(String[] args) {
        int a;
        int b;
        int prod = Multiple(4, 4);
        System.out.println("The Product of two number is : " +prod);

        int produ = Multiple(10, 10);
        System.out.println("The Product of two number is :" +produ)  ;
    }
}
