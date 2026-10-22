class Solution {
    public int maxArea(int[] height) {

        // Starting mein left pointer first element par
        int left = 0;

        // Right pointer last element par
        int right = height.length - 1;

        // Maximum area store karega
        int maxArea = 0;

        // Jab tak left aur right alag hain
        while (left < right) {

            // Dono lines ke beech ki width
            int width = right - left;

            // Dono heights mein se chhoti height
            int minHeight = Math.min(height[left], height[right]);

            // Current container ka area
            int area = width * minHeight;

            // Maximum area update karo
            maxArea = Math.max(maxArea, area);

            // Jis side ki height chhoti hai,
            // us pointer ko move karo
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Maximum water return karo
        return maxArea;
    }
}