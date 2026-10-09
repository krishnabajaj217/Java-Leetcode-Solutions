// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         boolean found=false;
//         for(int i=0;i<nums.length;i++){
//             if(target==nums[i]){
//                 found=true;
//                 return i;
//             }
//         }
//         if(!found){
//             int i=0;
//             int j=1;
//             while(i<nums.length){
//                 if(target>nums[i] && target<nums[j]){
//                     return j;
//                 }
//                 else if(nums[i]>target && nums[j]>target){
//                     return nums.length-1;
//                 }
//                 i++;
//                 j++;
//             }
//         }

//     }
// }
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }

        if (target < nums[0]) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }

        return nums.length;
    }
}