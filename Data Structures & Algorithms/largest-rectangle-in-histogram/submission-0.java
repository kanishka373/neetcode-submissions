class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            // Last mein 0 use karenge taaki stack ke remaining bars bhi process ho
            int currHeight = (i == heights.length) ? 0 : heights[i];

            // Current height choti hai toh previous bar ka rectangle calculate karo
            while (!st.isEmpty() && heights[st.peek()] > currHeight) {

                // Stack ke top index ko remove karo
                int height = heights[st.pop()];

                // Width calculate karo
                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                // Rectangle ka area
                int area = height * width;

                // Maximum area update
                maxArea = Math.max(maxArea, area);
            }

            // Current index stack mein add karo
            st.push(i);
        }

        return maxArea;
    }
}