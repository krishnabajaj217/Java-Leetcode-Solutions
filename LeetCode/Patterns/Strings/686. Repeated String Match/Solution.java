// class Solution {
//     public int repeatedStringMatch(String a, String b) {
//         StringBuilder sb=new StringBuilder();
//         int count=0;
//         while(!sb.toString().contains(b)){
//             sb.append(a);
//             count++;
//             if(sb.length()>a.length()+b.length()){
//                 return -1;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if (sb.toString().contains(b)) {
            return count;
        }

        sb.append(a);
        count++;

        if (sb.toString().contains(b)) {
            return count;
        }

        return -1;
    }
}