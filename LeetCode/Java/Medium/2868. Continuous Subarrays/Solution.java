class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int left = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current number
            map.put(nums[right],
                    map.getOrDefault(nums[right], 0) + 1);

            // Shrink while max - min > 2
            while (map.lastKey() - map.firstKey() > 2) {

                int value = nums[left];

                map.put(value, map.get(value) - 1);

                if (map.get(value) == 0) {
                    map.remove(value);
                }

                left++;
            }

            // Count all valid subarrays ending at right
            count += right - left + 1;
        }

        return count;
    }
}