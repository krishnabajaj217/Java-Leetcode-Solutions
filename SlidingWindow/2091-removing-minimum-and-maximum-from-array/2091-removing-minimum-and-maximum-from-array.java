// class Solution {
//     public int minimumDeletions(int[] nums) {
//         if(nums.length<=1){
//             return 1;
//         }
//         int max=nums[0];
//         int min=nums[0];
//         else{
//             for(int i=0;i<nums.length;i++){
//                 if(nums[i]>max){
//                     max=nums[i];
//                 }
//                 if(nums[i]<min){
//                     min=nums[i];
//                 }
            
//         }
//         for(int i=0;i<nums.length;i++){
//             if(min==nums[i]){
//                 int j=i;
//             }
//             if(max==nums[i]){
//                 int k=i;
//             }
//         int res=Math.max()

// }
// }
class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        int min = nums[0];
        int max = nums[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int bothFront = Math.max(minIndex, maxIndex) + 1;

        int bothBack = Math.max(
            n - minIndex,
            n - maxIndex
        );

        int minFrontMaxBack =
            (minIndex + 1) + (n - maxIndex);

        int maxFrontMinBack =
            (maxIndex + 1) + (n - minIndex);

        return Math.min(
            Math.min(bothFront, bothBack),
            Math.min(minFrontMaxBack, maxFrontMinBack)
        );
    }
}