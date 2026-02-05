class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=nums.length-1;i>=0;i--){
            if(ans.containsKey(nums[i])) return (i+3)/3;
            ans.put(nums[i],1);
        }
        return 0;
    }
}