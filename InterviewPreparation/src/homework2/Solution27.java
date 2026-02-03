package homework2;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int first = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[first++] = nums[i];
            }
        }
        return first;
    }
}