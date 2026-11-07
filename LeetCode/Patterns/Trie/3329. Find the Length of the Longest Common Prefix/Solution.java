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
//TLE
// class Solution {
//     public int longestCommonPrefix(int[] arr1, int[] arr2) {
//         int maxLen = 0;

//         for (int i = 0; i < arr1.length; i++) {
//             String s1 = String.valueOf(arr1[i]);

//             for (int j = 0; j < arr2.length; j++) {
//                 String s2 = String.valueOf(arr2[j]);

//                 int k = 0;

//                 while (k < s1.length() && k < s2.length()
//                         && s1.charAt(k) == s2.charAt(k)) {
//                     k++;
//                 }
//                 maxLen = Math.max(maxLen, k);
//             }
//         }
//         return maxLen;
//     }
// }
import java.util.*;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();

        for (int num : arr1) {
            String s = String.valueOf(num);

            for (int i = 1; i <= s.length(); i++) {
                set.add(s.substring(0, i));
            }
        }

        int maxLen = 0;

        for (int num : arr2) {
            String s = String.valueOf(num);

            for (int i = 1; i <= s.length(); i++) {
                String prefix = s.substring(0, i);

                if (set.contains(prefix)) {
                    maxLen = Math.max(maxLen, i);
                }
            }
        }

        return maxLen;
    }
}