// // Find K Closest Elements
// // Given a sorted integer array arr, two integers k and x,
// //  return the k closest integers to x in the array. 
// // The result should also be sorted in ascending order.

// // An integer a is closer to x than an integer b if:
// // |a - x| < |b - x|, or
// // |a - x| == |b - x| and a < b
 
// // Example 1:

// // Input: arr = [1,2,3,4,5], k = 4, x = 3

// // Output: [1,2,3,4]

// // Example 2:

// // Input: arr = [1,1,2,3,4,5], k = 4, x = -1

// // Output: [1,1,2,3]

// // sample test case:
// // input=6
// // 1 2 3 4 5 6
// // 3
// // 10
// // output=4 5 6

// // import java.util.*;
// // class test{
// //     public static void main(String[] args){
// //         Scanner sc=new Scanner(System.in);
// //         List<Integer> list1=new ArrayList<>(Collections.sort());
// //           List<Integer> list2=new ArrayList<>();
// //         int n=sc.nextInt();
// //         int[] arr=new int[n];
// //         int k=sc.nextInt();
// //         int x=sc.nextInt();
// //         int a=arr[0];
// //         for(int i=0;i<n;i++){
// //             arr[i]=sc.nextInt();
// //         }
// //         for(int i=0;i<arr.length;i++){
// //             int x1=Math.abs(arr[i]-x);
// //             // int x2=Math.abs(b-x);
// //             list.add(x1);
            
// //         }
// //         for(int i=0;i<n-k;i++){
// //             list2.add(list1.get(i));
// //         }
// //         System.out.println(list2);
// //     }
// // }
// import java.util.*;
// class test{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i= 0;i< n;i++){
//             arr[i] = sc.nextInt();
// }
//         int k = sc.nextInt();
//         int x = sc.nextInt();
//         int left = 0;
//         int right = arr.length - 1;
//         while (right - left>=k){
//             if (Math.abs(arr[left] - x)>Math.abs(arr[right] - x)){
//                 left++;
// }          
//             else{
//                 right--;
// }
// }
//         for(int i=left;i<=right;i++){
//             System.out.print(arr[i] + " ");
// }
// }
// }
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;

while (right - left >= k) {
    if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
        left++;
    } else {
        right--;
    }
}

ArrayList<Integer> ans = new ArrayList<>();

for (int i = left; i <= right; i++) {
    ans.add(arr[i]);
}

return ans;
    }
}