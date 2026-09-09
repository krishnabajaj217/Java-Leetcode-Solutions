import java.util.*;

class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        // Count frequency of each letter
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Sort frequencies
        Arrays.sort(freq);

        int ans = 0;
        int pos = 0;

        // Traverse from largest frequency
        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0)
                break;

            ans += freq[i] * ((pos / 8) + 1);
            pos++;
        }

        return ans;
    }
}