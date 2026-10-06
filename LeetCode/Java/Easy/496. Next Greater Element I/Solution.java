// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int[] ans = new int[nums1.length];

//         for (int i = 0; i < nums1.length; i++) {
//             int j = nums1[i];

//             for (int k = 0; k < nums2.length; k++) {

//                 if (j == nums2[k]) {

//                     for (int x = k + 1; x < nums2.length; x++) {

//                         if (nums2[x] > j) {
//                             ans[i] = nums2[x];
//                             break;
//                         }

//                         if (x == nums2.length - 1) {
//                             ans[i] = -1;
//                         }
//                     }

//                     break;
//                 }
//             }
//         }

//         return ans;
//     }
// }
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int j = nums1[i];

            for (int k = 0; k < nums2.length; k++) {
                if (j == nums2[k]) {
                    ans[i] = -1;   
                    for (int x = k + 1; x < nums2.length; x++) {
                        if (nums2[x] > j) {
                            ans[i] = nums2[x];
                            break;
                        }
                    }

                    break;
                }
            }
        }

        return ans;
    }
}