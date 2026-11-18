
class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();   
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : heights[i];  

            while (!st.isEmpty() && curr < heights[st.peek()]) {
                int h = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, h * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}