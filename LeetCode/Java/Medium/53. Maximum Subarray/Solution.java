// class Solution {
//     public int maxSubArray(int[] nums) {
//         int ms=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 ms=Math.max(sum,ms);
//             }
//         }
//         return ms;
//     }
// }
