
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            // Current character ki frequency badhao
            int index = s.charAt(right) - 'A';
            freq[index]++;

            // Window mein highest frequency update karo
            maxFreq = Math.max(maxFreq, freq[index]);

            // Agar replacements k se zyada chahiye, window shrink krne hai
            while ((right - left + 1) - maxFreq > k) {
                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;
                left++;
            }

            // Valid window ki maximum length save karo
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
