class Solution {
    public String longestCommonPrefix(String[] strs) {
          String res="";
        for(int i=0;i<strs.length;i++){
            char ch=strs[0].charAt(i);
            if(strs[1].indexOf(ch)!=-1 && strs[2].indexOf(ch)!=-1){
                res+=ch;
            }
        }
        return res;
    }
}