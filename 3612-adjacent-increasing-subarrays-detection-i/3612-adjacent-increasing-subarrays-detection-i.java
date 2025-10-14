class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int prev = 0, cur = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i-1) < nums.get(i)) cur++;
            else { prev = cur; cur = 1; }
            if ((cur >= k && prev >= k) || cur >= 2*k) return true;
        }
        return false;
    }
}
