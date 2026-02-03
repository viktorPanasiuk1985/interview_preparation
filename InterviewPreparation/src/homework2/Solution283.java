package homework2;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int first = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[first++] = nums[i];
            }
        }
        while (first < nums.length) {
            nums[first++] = 0;
        }
    }
}
