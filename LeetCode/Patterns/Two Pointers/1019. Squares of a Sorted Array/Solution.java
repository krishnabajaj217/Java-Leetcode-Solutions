// import java.util.Arrays;

// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         // Step 1: Square each element in place
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }
    
//         Arrays.sort(nums);
//         return nums;
//     }
// }
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        
        // Fill the result array from right to left with the largest squares first
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        
        return result;
    }
}