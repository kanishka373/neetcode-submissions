

class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Window ke andar kaunse characters hain
        HashSet<Character> set = new HashSet<>();

        // Window ka left end
        int left = 0;

        // Maximum length store karega
        int maxLength = 0;

        // Right pointer poori string traverse karega
        for (int right = 0; right < s.length(); right++) {

            // Current character
            char ch = s.charAt(right);

            // Agar character already window mein hai
            while (set.contains(ch)) {

                // Left wala character remove karo
                set.remove(s.charAt(left));

                // Left pointer aage badhao
                left++;
            }

            // Current character ko window mein add karo
            set.add(ch);

            // Current window ki length
            int length = right - left + 1;

            // Maximum length update karo
            maxLength = Math.max(maxLength, length);
        }

        // Final answer
        return maxLength;
    }
}