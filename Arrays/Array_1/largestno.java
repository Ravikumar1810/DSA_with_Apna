//finding a largest and smallest number in the Array

package Arrays.Array_1;

public class largestno {
    
    public static int  getLatestNum(int numbers[]) { 
     int largest = Integer.MIN_VALUE; 
     int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }

            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return  largest;
    }

    public static void main(String[] args) {
        int numbers[] = {66, 96, 99, 34, 18};
        int index = getLatestNum(numbers);
        System.out.println("The largest number is : " + index);
    }
}
