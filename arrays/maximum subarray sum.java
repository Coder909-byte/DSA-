class Solution {
    public int maxSubArray(int[] nums) {
        // Step 1: Start both currMax and globalMax with the first element
        int currMax = nums[0];
        int globalMax = nums[0];

        // Step 2: Traverse from the second element onward
        for (int i = 1; i < nums.length; i++) {
            
            // Deciding whether to extend the existing streak or start fresh from nums[i]
            currMax = Math.max(nums[i], currMax + nums[i]);

            // Update our all-time best sum found so far
            if (currMax > globalMax) {
                globalMax = currMax;
            }
        }

        return globalMax;
    }
}
///kadane's algorithm
/// 