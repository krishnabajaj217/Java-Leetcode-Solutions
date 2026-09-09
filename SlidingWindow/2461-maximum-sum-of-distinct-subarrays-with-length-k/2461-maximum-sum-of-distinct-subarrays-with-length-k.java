class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long window_sum = 0;
        long max_sum = 0;

        // First window
        for (int i = 0; i < k; i++) {

            window_sum += nums[i];

            map.put(nums[i],
                    map.getOrDefault(nums[i], 0) + 1);
        }

        // Check first window
        if (map.size() == k) {
            max_sum = window_sum;
        }

        // Sliding Window
        for (int i = k; i < nums.length; i++) {

            // Remove old element
            int left = nums[i - k];

            window_sum -= left;

            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0) {
                map.remove(left);
            }

            // Add new element
            int right = nums[i];

            window_sum += right;

            map.put(right,
                    map.getOrDefault(right, 0) + 1);

            // Check distinct
            if (map.size() == k) {
                max_sum = Math.max(max_sum, window_sum);
            }
        }

        return max_sum;
    }
}