  class Solution {
    public int findPeakElement(int[] nums) {

        // Search range ka starting point
        int left = 0;

        // Search range ka ending point
        int right = nums.length - 1;

        // Jab tak left aur right alag hain
        while (left < right) {

            // Middle element
            int mid = left + (right - left) / 2;

            // Agar mid ka next element bada hai
            if (nums[mid] < nums[mid + 1]) {

                // Peak right side mein hai
                left = mid + 1;
            }

            // Agar mid current element bada hai
            else {

                // Peak mid ya left side mein ho sakta hai
                right = mid;
            }
        }

        // Jab left == right, wahi peak ka index hai
        return left;
    }
}
