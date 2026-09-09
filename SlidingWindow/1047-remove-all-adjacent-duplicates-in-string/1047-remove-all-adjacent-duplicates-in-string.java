// class Solution {
//     public String removeDuplicates(String s) {
//         StringBuilder sb=new StringBuilder(s);
//         while(sb.length()>1){
//             boolean found=false;
//             for(int i=0;i<sb.length()-1;i++){
//                 if(sb.charAt(i)==sb.charAt(i+1)){
//                     sb.delete(i,i+2);
//                     found=true;
//                     break;
//                 }
//             }
//             if(!found){
//                 break;
//             }
//         }
//         return sb.toString();
//     }
// }
class Solution {
    public String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (sb.length() > 0 &&
                sb.charAt(sb.length() - 1) == c) {

                sb.deleteCharAt(sb.length() - 1);

            } else {

                sb.append(c);
            }
        }

        return sb.toString();
    }
}