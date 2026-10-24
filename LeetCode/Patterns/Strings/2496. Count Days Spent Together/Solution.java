class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // for(int i=1;i<366;i++){
        //     if(arriveAlice.substring(0,2).equals(leaveAlice.substring(0,2))){

        //     }
        // }
        int[] arr=new int[31];
        if(!(leaveAlice.substring(0,2).equals(arriveBob.substring(0,2)))){
            return 0;
        }
        else{
            int ald=Integer.parseInt(leaveAlice.substring(3,5));
            int bld=Integer.parseInt(arriveBob.substring(3,5));
            int res=ald-bld+1;
            // int res=Integer.parseInt(leaveAlice.substring(3,5)-arriveBob.substring(3,5));
            return res;
        }
    }
}