
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();

        int n = nums.length;

        int[] ans = new int[n - k + 1];

        int idx = 0;

        for (int i = 0; i < n; i++) {

            // Step 1: Window ke bahar wale index remove krne h
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Step 2: Chhote elements ko bhi rem krna h
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Step 3: Current index add karo
            dq.offerLast(i);

            // Step 4: Jab first window complete ho jaye
            if (i >= k - 1) {

                // Deque ke front par maximum element hai
                ans[idx] = nums[dq.peekFirst()];

                idx++;
            }
        }

        return ans;
    }
}
