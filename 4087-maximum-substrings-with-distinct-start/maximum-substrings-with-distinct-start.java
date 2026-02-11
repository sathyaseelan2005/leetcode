class Solution {
    public int maxDistinct(String s) {
        int [] hash= new int[26];
        int c=0;
        char [] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){

            hash[ch[i]-'a']++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]>0){
                c++;
            }
        }
        return c;
    }

}