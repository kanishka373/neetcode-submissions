class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Smaller array par binary search lagayenge
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        // Left side mein kitne total elements hone chahiye
        int half = (m + n + 1) / 2;

        while (low <= high) {

            // First array ka partition
            int i = (low + high) / 2;

            // Second array ka partition
            int j = half - i;

            // First array ke left aur right elements
            int left1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int right1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            // Second array ke left aur right elements
            int left2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int right2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Correct partition mil gaya
            if (left1 <= right2 && left2 <= right1) {

                // Total elements odd hain
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                // Total elements even hain
                return (Math.max(left1, left2)
                        + Math.min(right1, right2)) / 2.0;
            }

            // First array ka left element bada hai
            else if (left1 > right2) {
                high = i - 1;
            }

            // First array ka right element chhota hai
            else {
                low = i + 1;
            }
        }

        return 0.0;
    }
}