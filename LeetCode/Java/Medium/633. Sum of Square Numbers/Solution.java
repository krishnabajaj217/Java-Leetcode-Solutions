// class Solution {
//     public boolean judgeSquareSum(int c) {
//         for(int i=0;i<=c;i++){
//             for(int j=0;j<=c;j++){
//                 if(i*i+j*j==c){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }\
// class Solution {
//     public boolean judgeSquareSum(int c) {
//         for (int i = 0; i * i <= c; i++) {
//             int remaining = c - i * i;
//             int j = (int) Math.sqrt(remaining);

//             if (j * j == remaining) {
//                 return true;
//             }
//         }

//         return false;
//     }
//     }
class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);

        while (left <= right) {
            long sum = (long) left * left + (long) right * right;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}