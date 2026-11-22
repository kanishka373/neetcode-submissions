
class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            // Agar zero mila toh count badhao
            if (nums[right] == 0) {
                zeros++;
            }

            // Agar zeros allowed k se zyada ho gaye
            while (zeros > k) {

                // Left par zero hai toh count kam karo
                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
