//finding the binary search in the array

package Arrays.Array_1;

public class BinarySearch {
    public static int binarySearchPro(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //Comparison
            if(numbers[mid]== key) {  //found 
              return  mid;
            } 
            if(numbers[mid] < key) { //key is greater than mid element
                start = mid + 1;
            } else {               //key is less than mid element
                end = mid -1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int numbers[] = {23, 45, 99, 96, 18};
        int key = 99;

        int index = binarySearchPro(numbers, key);
        if(index == -1) {
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Found at index : " + index);
        }

    }
}
