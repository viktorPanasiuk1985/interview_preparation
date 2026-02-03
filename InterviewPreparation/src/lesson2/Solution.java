package lesson2;

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1, i = 0;
        while (i <= high) {
            if (nums[i] == 0) {
                swap(nums, low++, i++);
            } else if (nums[i] == 2) {
                swap(nums, high--, i);
            } else if (nums[i] == 1) {
                i++;
            }
        }
    }

    void swap(int nums[], int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}

