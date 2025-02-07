import java.util.HashSet;

public class ArrayEx1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1}; // Input array

        ArrayEx1 obj = new ArrayEx1();
        System.out.println(obj.containsDuplicate(nums)); // Expected Output: true
    }
}
