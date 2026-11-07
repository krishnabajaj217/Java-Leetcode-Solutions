class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int len=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(String.valueOf(arr2[j]).startsWith(String.valueOf(arr1[i]))){
                    if(i<=String.valueOf(arr2[j]).length()){
                        len++;
                    }
                }
            }
        }
        return len;
    }
}