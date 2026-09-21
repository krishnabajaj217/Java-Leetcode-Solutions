// class Solution {
//     public int myAtoi(String s) {
//         int num=0;

//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 continue;
//             }
//             else if(Character.isDigit(s.charAt(i))){
//                 num+=int(s.charAt(i));
//         }
//         else if(s.charAt(i)=='-'){
//             num+=-s.charAt(i);
//         }
//         else if(!Character.isDigit(s.charAt(i))){
//             break;
//         }
//         // return num;
//     }
//      return num;
//     }
// }
class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int sign = 1;
        boolean started = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ' && !started) {
                continue;
            }

            if ((ch == '+' || ch == '-') && !started) {
                sign = ch == '-' ? -1 : 1;
                started = true;
                continue;
            }

            if (Character.isDigit(ch)) {
                started = true;
                num = num * 10 + (ch - '0');
            } else {
                break;
            }
        }

        return num * sign;
    }
}