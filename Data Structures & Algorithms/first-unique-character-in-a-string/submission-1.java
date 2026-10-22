
class Solution {
    public int firstUniqChar(String s) {

        // 26 lowercase English letters ki frequency store karenge
        int[] freq = new int[26];

        // PASS 1:
        // Har character ki frequency count karo
        for (int i = 0; i < s.length(); i++) {

            // 'a' = 0, 'b' = 1, 'c' = 2...
            int index = s.charAt(i) - 'a';

            // Us character ka count badhao
            freq[index]++;
        }

        // PASS 2:
        // Left se right jao aur pehla character
        // jiska count 1 hai, uska index return karo
        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            // Agar character sirf ek baar aaya hai
            if (freq[index] == 1) {
                return i;
            }
        }

        // Agar koi unique character nahi mila
        return -1;
    }
}
