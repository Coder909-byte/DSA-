class Solution {
    public int fib(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0; // Represents Fib(0)
        int b = 1; // Represents Fib(1)

        // Calculate from index 2 up to n
        for (int i = 2; i <= n; i++) {
            int c = a + b; // Current Fibonacci number
            a = b;         // Shift 'a' to the right
            b = c;         // Shift 'b' to the right
        }

        return b; // 'b' now holds Fib(n)
    }
} 