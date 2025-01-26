/// finding the linear search in the Array

package Arrays.Array_1;

public class LinearSerch {  
    public  static int linearSerchPro(int numbers[], int key) {
        for(int i= 0; i<numbers.length; i++) {
            if(numbers[i] == key) {
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {43, 69, 54, 12, 56, 67, 89};
        int key = 67;

         int index =linearSerchPro(numbers, key);
        if(index == -1) {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("Found at index " + index);
        }

    }
}
