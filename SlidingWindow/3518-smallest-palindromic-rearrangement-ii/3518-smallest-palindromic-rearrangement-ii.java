class Solution {

    private static final long LIMIT = 1_000_001L;

    public String smallestPalindrome(String s, int k) {

        int[] frequency = new int[26];

        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        int[] halfFrequency = new int[26];
        char middle = 0;
        int halfLength = 0;

        for (int i = 0; i < 26; i++) {
            halfFrequency[i] = frequency[i] / 2;
            halfLength += halfFrequency[i];

            if (frequency[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }

        // Check whether at least k permutations exist
        if (countPermutations(halfFrequency) < k) {
            return "";
        }

        StringBuilder left = new StringBuilder();

        /*
         * Construct the k-th lexicographically smallest
         * permutation of the left half.
         */
        for (int position = 0; position < halfLength; position++) {

            for (int i = 0; i < 26; i++) {

                if (halfFrequency[i] == 0) {
                    continue;
                }

                // Temporarily choose this character
                halfFrequency[i]--;

                long possible =
                    countPermutations(halfFrequency);

                if (possible >= k) {
                    left.append((char) ('a' + i));
                    break;
                }

                // Skip all permutations starting with this character
                k -= possible;

                // Restore because this character was not selected
                halfFrequency[i]++;
            }
        }

        StringBuilder answer = new StringBuilder();

        answer.append(left);

        if (middle != 0) {
            answer.append(middle);
        }

        answer.append(new StringBuilder(left).reverse());

        return answer.toString();
    }

    /*
     * Number of distinct permutations:
     *
     * total! / (count1! * count2! * ...)
     *
     * Computed using combinations:
     *
     * C(total, count1) *
     * C(total-count1, count2) * ...
     */
    private long countPermutations(int[] frequency) {

        int remaining = 0;

        for (int count : frequency) {
            remaining += count;
        }

        long ways = 1;

        for (int count : frequency) {

            if (count == 0) {
                continue;
            }

            long combinations = combination(remaining, count);

            ways = multiplyCapped(ways, combinations);

            if (ways >= LIMIT) {
                return LIMIT;
            }

            remaining -= count;
        }

        return ways;
    }

    private long combination(int n, int r) {

        r = Math.min(r, n - r);

        long result = 1;

        for (int i = 1; i <= r; i++) {

            result =
                result * (n - r + i) / i;

            if (result >= LIMIT) {
                return LIMIT;
            }
        }

        return result;
    }

    private long multiplyCapped(long a, long b) {

        if (a >= LIMIT || b >= LIMIT) {
            return LIMIT;
        }

        if (a > LIMIT / b) {
            return LIMIT;
        }

        return Math.min(a * b, LIMIT);
    }
}