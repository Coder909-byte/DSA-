class Solution {
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        helper(arr, left, right);
    }

    public void helper(int[] arr, int left, int right) {
        // base case: pointers have met or crossed, nothing left to swap
        if (left >= right) {
            return;
        }

        // swap using temp variable
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // move inward and repeat
        helper(arr, left + 1, right - 1);
    }
}