import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        // Step 1: Square each element in place
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        // Step 2: Sort the array in non-decreasing orde
        Arrays.sort(nums);
        
        // Step 3: Return the sorted array
        return nums;
    }
}