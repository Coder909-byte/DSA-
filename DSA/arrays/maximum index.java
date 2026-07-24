class Solution {
    public int maxIndexDiff(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Step 1: Fill leftMin from left to right
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }

        // Step 2: Fill rightMax from right to left
        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(arr[j], rightMax[j + 1]);
        }

        // Step 3: Traverse both arrays using two pointers
        int i = 0, j = 0;
        int maxDiff = 0;

        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                // Valid pair! Update maxDiff and try to expand j
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                // Invalid pair! Move i forward to look for a smaller starting element
                i++;
            }
        }

        return maxDiff;
    }
}