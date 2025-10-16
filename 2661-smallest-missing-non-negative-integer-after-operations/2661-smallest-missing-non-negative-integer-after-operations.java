class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];
        for (int x : nums) {
            int r = ((x % value) + value) % value;
            count[r]++;
        }
        int mex = 0;
        while (count[mex % value]-- > 0) mex++;
        return mex;
    }
}
