package ifelse;

public class Age {
    public static void main(String[] args) {
        
        int age = 20;

        if(age >=18) {
            System.out.println("Eligible for vote");
        } else if (age >=13 && age < 18) {
            System.out.println("teenager");
        }   else {
            System.out.println("not eligible for vote");
        }
    }
}
