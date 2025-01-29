// Prefix Max Subarray Sum
package Arrays.Array_2;

public class prifixSubArray {
    public static void prifixSubArraySum(int numbers[]) {
        int curSum = 0; //current sum
        int maxSum = Integer.MIN_VALUE; 
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i = 1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i<numbers.length; i++) {
            int start = i;  //start
            for(int j = i; j< numbers.length; j++) { 
                int end = j; //end 
                curSum = start == 0 ? prefix[end] :  prefix[end] - prefix[start-1];
                 if(curSum > maxSum) {
                    maxSum = curSum;
                 }
            }
            // System.out.println(""); 
        }
        System.out.println("The Max SubArray Sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        prifixSubArraySum(numbers);
    }
}
