class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;

        // Recursively find sum of digits, then pass that sum back into addDigits
        return addDigits(sumDigits(num));
    }

    private int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}