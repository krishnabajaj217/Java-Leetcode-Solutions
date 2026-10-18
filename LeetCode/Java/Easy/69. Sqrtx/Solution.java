// class Solution {
//     public int mySqrt(int x) {
//         // double res=Math.pow(x,0.5);
//         // return (int)res;
//         if(x==0 || x==1){
//             return x;
//         }
//         int res
//         while(){
//             // int res=x**1/2;
//             if(i**2==x){
                
//             }

//         }
//     }
// }
class Solution {
    public int mySqrt(int x) {
        int i = 0;

        while ((long) i * i <= x) {
            i++;
        }

        return i - 1;
    }
}