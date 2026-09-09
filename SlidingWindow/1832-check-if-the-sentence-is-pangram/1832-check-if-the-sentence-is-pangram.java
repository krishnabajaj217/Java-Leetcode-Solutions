class Solution {
    public boolean checkIfPangram(String sentence) {
        String s="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<s.length();i++){
            if(sentence.indexOf(s.charAt(i))==-1){
                return false;
            }
        }
        return true;
    }
}