// class Solution {
//     public int totalNumbers(int[] digits) {
//         // if(digits.length<=2){
//         //     return
//         // }
//         // int e=0;
//         // int count=0;
//         Set<Integer> uniqueNumbers = new HashSet<>();
//         for(int i=0;i<digits.length;i++){
//             if(digits[i]==0) continue;
//             for(int j=0;j<digits.length;j++){
//                 for(int k=0;k<digits.length;k++){
//                     if(i!=j && j!=k && i!=k){
//                         if (digits[k] % 2 == 0) {
//                             // uniqueNumbers.add(num);
//                             String res=String.valueOf(digits[i]+digits[j]+digits[k]);
//                              uniqueNumbers.add(Integer.parseInt(res));
//                         //     if(Integer.parseInt(res)%2==0){
//                         //          count++;
//                         // }
//                         }
//                     }
//                 }
//             }
//             // return count;
//         }
//         //  return count;
//         return uniqueNumbers.size();
//         }
//     }
import java.util.*;

class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            // Hundreds digit cannot be 0
            if (digits[i] == 0) continue; 

            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    // Ensure distinct indices
                    if (i != j && j != k && i != k) {
                        
                        // Units digit must be even
                        if (digits[k] % 2 == 0) {
                            // String concatenation using ""
                            String res = digits[i] + "" + digits[j] + "" + digits[k];
                            int num = Integer.parseInt(res);
                            
                            // HashSet handles unique numbers automatically
                            uniqueNumbers.add(num);
                        }
                    }
                }
            }
        }
        
        return uniqueNumbers.size();
    }
}