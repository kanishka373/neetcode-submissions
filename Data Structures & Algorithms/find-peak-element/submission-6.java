  class Solution {
    public int findPeakElement(int[] nums) {


        int low = 0;
        int high = nums.length - 1;


        // Jab tak ek hi element na bach jaye
        while (low < high) {


            // Middle index
            int mid = low + (high - low) / 2;


            // Agar right wala bada hai
            // To peak right side me hogi
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }


            // Warna peak left side ya mid par hogi
            else {
                high = mid;
            }
        }


        // Low aur High dono peak ke index par aa jayenge
        return low;
    }
}

    
