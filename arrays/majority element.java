class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        // Step 1: Find the majority candidate using Boyer-Moore Voting
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        // Step 2: Return candidate (guaranteed to exist on LeetCode)
        return candidate;
    }
}

//boyer-moore voting algorithm