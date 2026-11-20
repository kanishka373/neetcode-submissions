
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Right element window mein add karo
            sum += nums[right];

            // Jab sum target ke equal ya greater ho
            while (sum >= target) {

                // Minimum length calculate karo
                minLen = Math.min(minLen, right - left + 1);

                // Left element remove karo
                sum -= nums[left];

                // Left pointer aage badhao
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
