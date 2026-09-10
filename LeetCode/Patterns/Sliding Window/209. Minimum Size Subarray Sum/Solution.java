class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int cl=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum>=target){
        //             int len=j-i+1;
        //             cl=Math.min(cl,len);
        //             break;
        //         }
        //     }
        // }
        // if(cl==Integer.MAX_VALUE){
        //     return 0;
        // }
        // return cl;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                ans=Math.min(ans,r-l+1);
                sum-=nums[l];
                l++;

            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}