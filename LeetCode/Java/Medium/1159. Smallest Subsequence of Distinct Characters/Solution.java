class Solution {
    public String smallestSubsequence(String s) {

        int[] frequency = new int[26];
        boolean[] used = new boolean[26];

        // Count how many times every character appears
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            int index = current - 'a';

            // Current occurrence is now being processed
            frequency[index]--;

            // Character is already present in result
            if (used[index]) {
                continue;
            }

            /*
             * Remove characters from the end when:
             * 1. Last character is lexicographically larger.
             * 2. Last character appears again later.
             */
            while (
                stack.length() > 0 &&
                stack.charAt(stack.length() - 1) > current &&
                frequency[stack.charAt(stack.length() - 1) - 'a'] > 0
            ) {
                char removed = stack.charAt(stack.length() - 1);

                stack.deleteCharAt(stack.length() - 1);
                used[removed - 'a'] = false;
            }

            stack.append(current);
            used[index] = true;
        }

        return stack.toString();
    }
}