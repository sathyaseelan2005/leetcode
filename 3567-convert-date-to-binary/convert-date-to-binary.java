class Solution {
    public String convertDateToBinary(String date) {
        String [] part =date.split("-");
        StringBuilder str =new StringBuilder();
        for(int i=0;i<part.length;i++){
            int num=Integer.parseInt(part[i]);
            str.append(Integer.toBinaryString(num));
            if(i<part.length-1){
                str.append("-");
            }

        }
        return str.toString();
    }
}