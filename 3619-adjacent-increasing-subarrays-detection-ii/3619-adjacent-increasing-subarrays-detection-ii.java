class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int maxK = 0, prev = 0, curr = 1;

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                curr++;  // still increasing
            } else {
                // calculate possible k values
                maxK = Math.max(maxK, Math.max(curr / 2, Math.min(prev, curr)));
                prev = curr;  // move current run to previous
                curr = 1;     // reset
            }
        }

        // final check after loop ends
        maxK = Math.max(maxK, Math.max(curr / 2, Math.min(prev, curr)));

        return maxK;
    }
}
