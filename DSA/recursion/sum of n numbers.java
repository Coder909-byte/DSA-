class Solution {
    public int sumOfN(int n) {
        if (n == 0) return 0; // base case
        return n + sumOfN(n - 1); // trust smaller call, add on the way back
    }
}