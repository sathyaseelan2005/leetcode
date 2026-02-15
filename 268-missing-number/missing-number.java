class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,sum=0;
        int ans = n*(n+1)/2;
        for(int num:nums){
            sum+=num;
        }
        return ans-sum;
    }
}