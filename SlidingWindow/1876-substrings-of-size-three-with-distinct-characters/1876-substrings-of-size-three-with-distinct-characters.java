// 
// import java.util.*;

// class Solution {
//     public int countGoodSubstrings(String s) {

//         int count = 0;

//         for (int i = 0; i <= s.length() - 3; i++) {

//             String sub = s.substring(i, i + 3);

//             if (uniqueChar(sub)) {
//                 count++;
//             }
//         }

//         return count;
//     }

//     public boolean uniqueChar(String str) {

//         Set<Character> set = new HashSet<>();

//         for (char c : str.toCharArray()) {

//             if (!set.add(c)) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }

class Solution {
    public int countGoodSubstrings(String s) {

        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {

            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if (a != b && b != c && a != c) {
                count++;
            }
        }

        return count;
    }
}