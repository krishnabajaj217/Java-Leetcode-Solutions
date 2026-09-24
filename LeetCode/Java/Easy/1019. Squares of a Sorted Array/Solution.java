import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        // Step 1: Square each element in place
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
    
        Arrays.sort(nums);
        return nums;
    }
}