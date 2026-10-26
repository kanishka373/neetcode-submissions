
class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome: center ek character
            int len1 = expand(s, i, i);

            // Even length palindrome: center do characters ke beech
            int len2 = expand(s, i, i + 1);

            // Dono mein se longest length choose karo
            int len = Math.max(len1, len2);

            // Agar naya palindrome bada hai, uski starting index save karo
            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }

        // Longest palindrome return krna hai
        return s.substring(start, start + maxLength);
    }

    private int expand(String s, int left, int right) {

        // Jab tak dono characters same hain, expand karte raho
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Loop rukne par ek step extra bahar chale gaye hote hain
        return right - left - 1;
    }
}