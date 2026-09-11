class Solution {
    public int totalNumbers(int[] digits) {
        // if(digits.length<=2){
        //     return
        // }
        // int e=0;
        // int count=0;
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && j!=k && i!=k){
                        if (digits[k] % 2 == 0) {
                            // uniqueNumbers.add(num);
                            int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                             uniqueNumbers.add(num);
                        //     if(Integer.parseInt(res)%2==0){
                        //          count++;
                        // }
                        }
                    }
                }
            }
            // return count;
        }
        //  return count;
        return uniqueNumbers.size();
        }
    }