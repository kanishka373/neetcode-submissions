
class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            // Current character ki frequency badhao
            freq[s.charAt(right) - 'A']++;

            // Maximum frequency update
            maxFreq = Math.max( maxFreq,  freq[s.charAt(right) - 'A']
            );

            // Window mein kitne replacements chahiye
            int changes = (right - left + 1) - maxFreq;

            // Agar replacements k se zyada hain
            if (changes > k) {

                // Left character remove karo
                freq[s.charAt(left) - 'A']--;

                left++;
            }

            // Maximum window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
