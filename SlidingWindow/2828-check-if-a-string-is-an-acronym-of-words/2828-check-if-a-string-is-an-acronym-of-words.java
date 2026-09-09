class Solution {
    public boolean isAcronym(List<String> words, String s) {
         if(words.size()!=s.length()){
            return false;
        }
        String res="";
        for(int i=0;i<words.size();i++){
            char c=words.get(i).charAt(0);
            res+=c;
        }
        return res.equals(s);
    }
}