class Solution {
    public boolean isSubsequence(String s, String t) {
        // boolean res=t.indexOf(s)!=-1?true:false;
        // return res;
        // for(int i=0;i<s.length();i++){
        //     int c=s.indexOf(s.charAt(i));
        // }
        //  int c1=s.indexOf(s.charAt(0));
        //  int c2=s.indexOf(s.charAt(1));
        //  int c3=s.indexOf(s.charAt(2));
         if(t.indexOf(s.charAt(0))<t.indexOf(s.charAt(1)) && t.indexOf(s.charAt(1))<t.indexOf(s.charAt(2))){
            return true;
         }
         return false;
    }
}