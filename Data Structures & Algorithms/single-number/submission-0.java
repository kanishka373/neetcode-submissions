
class Solution {
    public int singleNumber(int[] nums) {

        // Answer ko 0 se start karenge
        int ans = 0;

        // Array ke har number ko check karenge
        for (int num : nums) {

            // XOR karte jayenge
            ans = ans ^ num;
        }

        // Jo number sirf ek baar aaya hai
        return ans;
    }
}
