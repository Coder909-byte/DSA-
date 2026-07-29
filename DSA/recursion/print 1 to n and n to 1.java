class Solution {
    public void printOneToN(int n) {
        // base case: nothing left to print
        if (n == 0) return;

        printOneToN(n - 1); // go smaller first
        System.out.println(n); // print on the way back up → ascending
    }

    public void printNToOne(int n) {
        // base case: nothing left to print
        if (n == 0) return;

        System.out.println(n); // print on the way down → descending
        printNToOne(n - 1); // then go smaller
    }
}