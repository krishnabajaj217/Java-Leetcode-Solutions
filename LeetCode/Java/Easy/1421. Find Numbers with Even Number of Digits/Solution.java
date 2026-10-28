class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int res=String.valueOf(nums[i]).length();
            if(res%2==0){
                c++;
            }
        }
        return c;
    }

}