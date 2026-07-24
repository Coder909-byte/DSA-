class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        
        // Before we start walking backward, we initialize our running max to -1
        // because there are no elements to the right of the final slot.
        int maxSoFar = -1;

        // Traverse the array backward from right to left (index n-1 down to 0)
        for (int i = n - 1; i >= 0; i--) {
            // Step 1: Temporarily stash the original element value before overwriting it
            int currentElement = arr[i];

            // Step 2: Replace the current slot with the biggest value seen to its right
            arr[i] = maxSoFar;

            // Step 3: Update our running maximum so it includes the element we just replaced
            maxSoFar = Math.max(maxSoFar, currentElement);
        }

        // Return the modified array in-place
        return arr;
    }
}
