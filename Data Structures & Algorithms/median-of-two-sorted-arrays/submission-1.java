class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;  // First array ki length
        int n = nums2.length;  // Second array ki length

        int i = 0;  // First array ka pointer
        int j = 0;  // Second array ka pointer

        int prev = 0;  // Previous selected element
        int curr = 0;  // Current selected element

        // Middle tak elements select karenge
        for (int k = 0; k <= (m + n) / 2; k++) {

            prev = curr;  // Current ko previous bana do

            // Check karo first array ka element chhota hai ya nahi
            if (i < m && (j >= n || nums1[i] < nums2[j])) {

                curr = nums1[i];  // First array ka element lo
                i++;              // First pointer aage badhao
            }

            else {

                curr = nums2[j];  // Second array ka element lo
                j++;              // Second pointer aage badhao
            }
        }

        // Agar total elements odd hain
        if ((m + n) % 2 == 1) {
            return curr;
        }

        // Agar total elements even hain
        return (prev + curr) / 2.0;
    }
}