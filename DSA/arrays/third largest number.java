class Solution {
    public int thirdMax(int[] nums) {
        // Using Integer objects set to null to easily check if they've been filled
        Integer first = null;
        Integer second = null;
        Integer third = null;
        
        for (int num : nums) {
            // Skip duplicates: if the number matches any track, ignore it
            if ((first != null && num == first) || 
                (second != null && num == second) || 
                (third != null && num == third)) {
                continue;
            }
            
            // Case 1: New absolute champion
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } 
            // Case 2: Fits between first and second
            else if (second == null || num > second) {
                third = second;
                second = num;
            } 
            // Case 3: Fits between second and third
            else if (third == null || num > third) {
                third = num;
            }
        }
        
        // If third was never filled, return the absolute max (first)
        return (third == null) ? first : third;
    }
}