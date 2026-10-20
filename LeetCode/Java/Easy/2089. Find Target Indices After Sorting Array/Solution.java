class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                arr.add(i);
            }
        }
        return arr;
    }
}