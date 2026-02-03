class Solution {
    public boolean check(int[] nums) {
        int c=0;
        if(nums[nums.length - 1] > nums[0]) c++;
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i]>nums[i+1]) c++;
        }
        return c<=1;
    }
}