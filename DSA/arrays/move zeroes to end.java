class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Shift non-zeroes to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill the rest with zeroes
        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }
}