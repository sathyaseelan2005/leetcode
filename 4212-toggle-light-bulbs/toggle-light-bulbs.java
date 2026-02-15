class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> ans=new ArrayList<>();
        int hash[]=new int [101];
        for(int i=0;i<bulbs.size();i++){
            hash[bulbs.get(i)]++;;
        }
       for(int i=1;i<=100;i++){
        if(hash[i]%2==1){
            ans.add(i);
       }
       
    }
    return ans;
}
}