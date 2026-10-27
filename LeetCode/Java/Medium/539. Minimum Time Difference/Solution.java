// class Solution {
//     public int findMinDifference(List<String> timePoints) {
//         // int hrs=new int[24];
//         // int mts=new int[60];
//         int res=Integer.MAX_VALUE;;
//         for(int i=0;i<timePoints.size()-1;i++){
//             int m1=Integer.parseInt(timePoints.get(i).substring(3,5));
//             int m2=Integer.parseInt(timePoints.get(i+1).substring(3,5));
//             res=Math.min(m1,m2);
//         }
//         return res;
//     }
// }
import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutesList = new ArrayList<>();
        for (String time : timePoints) {
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3, 5));
            minutesList.add(h * 60 + m);
        }

        Collections.sort(minutesList);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < minutesList.size() - 1; i++) {
            int diff = minutesList.get(i + 1) - minutesList.get(i);
            minDiff = Math.min(minDiff, diff);
        }

        int firstTime = minutesList.get(0);
        int lastTime = minutesList.get(minutesList.size() - 1);
        int circularDiff = (1440 - lastTime) + firstTime;

        return Math.min(minDiff, circularDiff);
    }
}
