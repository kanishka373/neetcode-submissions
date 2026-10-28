
class Solution {
    public int removeElement(int[] nums, int val) {

        // k batayega next valid element kahan rakhna hai
        int k = 0;

        // Array ke har element ko check karo
        for (int i = 0; i < nums.length; i++) {

            // Agar element remove karne wali value nahi hai
            if (nums[i] != val) {

                // Use starting mein rakh do
                nums[k] = nums[i];

                // Valid elements ki count badhao
                k++;
            }
        }

        // Total valid elements ki count
        return k;
    }
}
