class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str += s.charAt(i);
            }
        }

        String rev = new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }
}