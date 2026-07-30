class Solution {
    public boolean isPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }

    public boolean helper(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return helper(s, left + 1, right - 1);
    }
}