class Solution {
    public int lengthOfLastWord(String s) {

        String[] str = s.split(" ");
        int n = str.length-1;
        while(str[n] == " ") n--;
        String st = str[n];
        //System.out.print(st);
        return st.length();
    }
}