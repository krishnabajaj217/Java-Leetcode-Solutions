// class Solution {
//     public int findNumbers(int[] nums) {
//         int c=0;
//         for(int i=0;i<nums.length;i++){
//             if(arr.get(i).size()%2==0)
//             int res=String.valueOf(nums[i]).length();
//             if(res%2==0){
//                 c++;
//             }
//         }
//         return c;
//     }

// }
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num =nums[i];
            int digits = 0;
            while(num>0) {
                num=num/10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}