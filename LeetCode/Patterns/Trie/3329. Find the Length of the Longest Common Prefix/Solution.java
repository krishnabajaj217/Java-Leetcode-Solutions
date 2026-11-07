// class Solution {
//     public int longestCommonPrefix(int[] arr1, int[] arr2) {
//         int len=0;
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if(String.valueOf(arr2[j]).startsWith(String.valueOf(arr1[i]))){
//                     if(i<=String.valueOf(arr2[j]).length()){
//                         len++;
//                     }
//                 }
//             }
//         }
//         return len;
//     }
// }
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int maxLen = 0;

        for (int i = 0; i < arr1.length; i++) {
            String s1 = String.valueOf(arr1[i]);

            for (int j = 0; j < arr2.length; j++) {
                String s2 = String.valueOf(arr2[j]);

                int k = 0;

                while (k < s1.length() && k < s2.length()
                        && s1.charAt(k) == s2.charAt(k)) {
                    k++;
                }
                maxLen = Math.max(maxLen, k);
            }
        }
        return maxLen;
    }
}