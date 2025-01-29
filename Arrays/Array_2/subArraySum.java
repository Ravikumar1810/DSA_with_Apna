// MAx Subarray Sum 
package Arrays.Array_2;

public class subArraySum {
    public static void MaxSubArraySum(int numbers[]) {
        int curSum = 0; //current sum
        int maxSum = Integer.MIN_VALUE; //max sum
        for(int i = 0; i<numbers.length; i++) {
            int start = i;  //start
            for(int j = i; j< numbers.length; j++) { 
                int end = j; //end 
                curSum = 0;
                for(int k = start; k<=end; k++) { //k = start to end 
                     curSum += numbers[k]; 
                }
                System.out.println(curSum);
                 if(curSum > maxSum) {
                    maxSum = curSum;
                 }
            }
            // System.out.println(""); 
        }
        System.out.println("The Max SubArray Sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        MaxSubArraySum(numbers);
    }
}
