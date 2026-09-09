// class Solution {
//     public int longestSubstring(String s, int k) {

//         int max_count = 0;

//         for (int i = 0; i < s.length(); i++) {

//             int[] freq = new int[26];

//             for (int j = i; j < s.length(); j++) {

//                 freq[s.charAt(j) - 'a']++;

//                 boolean valid = true;

//                 for (int x = 0; x < 26; x++) {
//                     if (freq[x] > 0 && freq[x] < k) {
//                         valid = false;
//                         break;
//                     }
//                 }

//                 if (valid) {
//                     max_count = Math.max(max_count, j - i + 1);
//                 }
//             }
//         }

//         return max_count;
//     }
// }
class Solution {
    public int longestSubstring(String s, int k) {

        if (s.length() < k)
            return 0;

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find a character whose frequency is less than k
        for (int i = 0; i < s.length(); i++) {

            if (freq[s.charAt(i) - 'a'] < k) {

                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);

                return Math.max(left, right);
            }
        }

        // Every character occurs at least k times
        return s.length();
    }
}