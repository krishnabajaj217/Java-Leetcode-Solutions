// class Solution {
//     public int minMoves(int[] nums) {
//         int count=0;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>max){
//                 max=nums[i];
//             }
//         }
//          for(int i=0;i<nums.length;i++){
//             count+=max -nums[i];
//             // int diff=max-nums[i];
//             // while(nums[i]!=max){
//             //     nums[i]++;
//             //     count++;
//             // }
//         }
//         return count;
//     }
// }
class Solution {

    public int minMoves(int[] nums) {
        int mx = nums[0];
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        int ans = 0;
        for (int x : nums) {
            ans += mx - x;
        }
        return ans;
    }
}