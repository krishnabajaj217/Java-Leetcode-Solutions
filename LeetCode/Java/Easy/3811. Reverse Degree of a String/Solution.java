class Solution {
    public int reverseDegree(String s) {
        // int count[]=new int[26];
        String rev_a="zyxwvutsrqponmlkjihgfedcba";
        int sum=0;
        // for(i=26;i>=1;i--){
        //     s.charAt()
        // }
        for(int i=0;i<s.length();i++){
            if(rev_a.indexOf(s.charAt(i))!=-1){
                sum+=(rev_a.indexOf(s.charAt(i))+1)*(i+1);
            }
        }
        return sum;
    }
}