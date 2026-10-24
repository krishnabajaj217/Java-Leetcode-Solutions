// class Solution {
//     public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
//         // for(int i=1;i<366;i++){
//         //     if(arriveAlice.substring(0,2).equals(leaveAlice.substring(0,2))){

//         //     }
//         // }
//         int[] arr=new int[31];
//         if(!(leaveAlice.substring(0,2).equals(arriveBob.substring(0,2)))){
//             return 0;
//         }
//         else{
//             int ald=Integer.parseInt(leaveAlice.substring(3,5));
//             int bld=Integer.parseInt(arriveBob.substring(3,5));
//             int res=ald-bld+1;
//             // int res=Integer.parseInt(leaveAlice.substring(3,5)-arriveBob.substring(3,5));
//             return res;
//         }
//     }
// }
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int aliceStart = dayOfYear(arriveAlice);
        int aliceEnd = dayOfYear(leaveAlice);
        int bobStart = dayOfYear(arriveBob);
        int bobEnd = dayOfYear(leaveBob);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }

    private int dayOfYear(String date) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        for (int i = 0; i < month - 1; i++) {
            day += daysInMonth[i];
        }

        return day;
    }
}