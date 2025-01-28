//Pair in the Array
package Arrays.Array_1;

public class PairArray {
    public static void PairInArray(int numbers[]) {
        int Tp = 0;                                   //Total Pairs
        for(int i = 0; i< numbers.length; i++) {   //Index 
            for(int j = i+1; j<numbers.length; j++) {  //Index 
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")"); // print pair 
                Tp++;   //increment Total pair
            }
            System.out.println(" ");   //New line 
        }
        System.out.println("Total pairs are :" +Tp);  
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        PairInArray(numbers);
    }
}
