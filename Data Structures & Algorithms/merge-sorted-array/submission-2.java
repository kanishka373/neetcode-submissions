
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // nums1 ke last actual element ka index
        int i = m - 1;

        // nums2 ke last element ka index
        int j = n - 1;

        // nums1 ki last position jahan element rakhna hai
        int k = m + n - 1;

        // Jab tak dono arrays mein elements bache hain
        while (i >= 0 && j >= 0) {

            // Agar nums1 ka element bada hai
            if (nums1[i] > nums2[j]) {

                // Bada element nums1 ki khaali position par rakho
                nums1[k] = nums1[i];

                // nums1 ka pointer peeche karo
                i--;

            } else {

                // Warna nums2 ka element rakho
                nums1[k] = nums2[j];

                // nums2 ka pointer peeche karo
                j--;
            }

            // Agli khaali position par jao
            k--;
        }

        // Agar nums2 mein elements abhi bhi bache hain
        while (j >= 0) {

            // Unhe nums1 mein copy karo
            nums1[k] = nums2[j];

            // Dono pointers peeche karo
            j--;
            k--;
        }
    }
}
