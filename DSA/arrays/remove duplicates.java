public class remove duplicates {
    class Solution {
    public int removeDuplicates(int[] nums) {
        // Step 1: Handle edge case (if array is empty, unique count is 0)
        if (nums.length == 0) {
            return 0;
        }

        // Step 2: Initialize our "Writer" pointer.
        // The first element (index 0) is always unique, so we start writing at index 1.
        int uniqueIdx = 1;

        // Step 3: Run the loop with our "Reader" (i)
        for (int i = 1; i < nums.length; i++) {
            
            // Just like your frequency logic: check if the streak broke!
            if (nums[i] != nums[i - 1]) {
                
                // The Reader found a new unique number! Write it down at our unique position.
                nums[uniqueIdx] = nums[i];
                
                // Move the Writer forward by one slot to prepare for the next unique number.
                uniqueIdx++;
            }
        }

        // Step 4: Return the total count of unique elements, which is exactly where uniqueIdx stopped!
        return uniqueIdx;
    }
}
}
