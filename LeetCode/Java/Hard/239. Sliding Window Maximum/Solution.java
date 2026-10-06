// class Solution {
//     public int[] maxSlidingWindow(int[] arr, int k) {

//         PriorityQueue<Integer> pq =
//             new PriorityQueue<>(Collections.reverseOrder());

//         int n = arr.length;
//         int[] res = new int[n - k + 1];
//         int idx = 0;
//         for (int i = 0; i < k; i++) {
//             pq.add(arr[i]);
//         }
//         res[idx++] = pq.peek();
//         for (int i = k; i < n; i++) {
//             pq.add(arr[i]);
//             pq.remove(arr[i - k]);
//             res[idx++] = pq.peek();
//         }

//         return res;
//     }
// }
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] res = new int[n - k + 1];

        // {value, index}
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> b[0] - a[0]);

        // First window
        for (int i = 0; i < k; i++) {
            pq.add(new int[]{nums[i], i});
        }

        res[0] = pq.peek()[0];

        // Slide window
        for (int i = k; i < n; i++) {

            // Add new element
            pq.add(new int[]{nums[i], i});

            // Remove elements outside current window
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            // Maximum
            res[i - k + 1] = pq.peek()[0];
        }

        return res;
    }
}