
class Solution {
    public int findMin(int[] nums) {

        // Binary Search ki starting aur ending positions
        int low = 0;
        int high = nums.length - 1;

        // Jab tak search range bachi hai
        while (low < high) {

            // Middle index find karo
            int mid = low + (high - low) / 2;

            // Agar middle element, last element se bada hai
            if (nums[mid] > nums[high]) {

                // Minimum right side mein hoga
                low = mid + 1;

            } else {

                // Minimum mid ya uske left side mein ho sakta hai
                high = mid;
            }
        }

        // Low aur high same index par aa jayenge
        return nums[low];
    }
}
