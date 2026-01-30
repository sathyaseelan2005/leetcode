class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0, min = 0, ans = 0;
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);
            min = Math.min(min + nums[i], nums[i]);
            ans = Math.max(ans, max);
            ans = Math.max(ans, -(min));
        }
        return ans;
    }
}