//Print Subarray 
package Arrays.Array_1;

public class SubArray {
    public static void printSubArray(int numbers[]) {
        int ts = 0;   // Total SubArray
        for(int i = 0; i<numbers.length; i++) {
            int start = i;  //start
            for(int j = i; j< numbers.length; j++) { 
                int end = j; //end 
                for(int k = start; k<=end; k++) { //k = start to end 
                    System.out.print(numbers[k]+ " "); // print k 
                }
                ts++;  //increment total subarray
                System.out.println(" ");
            }
            System.out.println(""); 
        }
        System.out.println("The Total Subarray are  :" +ts); //print total subarray
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArray(numbers); 
    }
}
