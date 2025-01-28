//reversing the Array
package Arrays.Array_1;

public class reverseNum {
    public static void reverse(int numbers[]) {
        int start = 0, end = numbers.length-1; //index

        while(start < end) { //while start is less than end 
            //Swap
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++; //increment start
            end--;//decrement end
        }
        // return 0;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10};
        reverse(numbers);

        for(int i = 0; i < numbers.length; i++) { //index 
            System.out.print(" " + numbers[i]); //print index 
        }
        System.out.println(" ");
    }
}
