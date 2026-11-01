
class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int minProduct = nums[0];

        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];

            // Negative number reverses max and min
            if (num < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maximum product
            maxProduct = Math.max(num, maxProduct * num);

            // Update minimum product
            minProduct = Math.min(num, minProduct * num);

            // Store overall maximum
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
