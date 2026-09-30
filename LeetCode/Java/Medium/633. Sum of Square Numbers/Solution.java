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
class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i * i <= c; i++) {
            int remaining = c - i * i;
            int j = (int) Math.sqrt(remaining);

            if (j * j == remaining) {
                return true;
            }
        }

        return false;
    }
    }