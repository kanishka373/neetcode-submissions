
class Solution {
    public int trap(int[] height) {

        // Starting aur ending pointers
        int left = 0;
        int right = height.length - 1;

        // Left aur right side ki maximum heights
        int leftMax = 0;
        int rightMax = 0;

        // Total trapped water
        int water = 0;

        // Jab tak pointers cross nahi karte
        while (left < right) {

            // Agar left side ki height chhoti hai
            if (height[left] < height[right]) {

                // Left side ka maximum update karo
                leftMax = Math.max(leftMax, height[left]);

                // Left side par kitna water store hoga
                water += leftMax - height[left];

                // Left pointer aage badhao
                left++;

            } else {

                // Right side ka maximum update karo
                rightMax = Math.max(rightMax, height[right]);

                // Right side par kitna water store hoga
                water += rightMax - height[right];

                // Right pointer peeche karo
                right--;
            }
        }

        // Total trapped water return karo
        return water;
    }
}
