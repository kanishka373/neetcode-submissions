class Solution {
    public void sortColors(int[] nums) {
 // 0 ki position
        int low = 0;

        // Current element
        int mid = 0;

        // 2 ki position
        int high = nums.length - 1;

        // Jab tak mid high ko cross na kare
         while (mid <= high) {

            // Agar 0 mila
            if (nums[mid] == 0) {

                // 0 ko left side bhejo
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            // Agar 1 mila
            else if (nums[mid] == 1) {

                // 1 already sahi jagah hai
                mid++;
            }

            // Agar 2 mila
            else {

                // 2 ko right side bhejo
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;

                // ⚠️ Mid ko increase nahi karna
            }
        }
    }
}