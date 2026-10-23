
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Array ko sort karo
        Arrays.sort(nums);

        // Step 2: Pehla number choose karo
        for (int i = 0; i < nums.length - 2; i++) {

            // Duplicate first numbers skip karo
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers set karo
            int left = i + 1;
            int right = nums.length - 1;

            // Jab tak pointers mil nahi jaate
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    // Triplet mil gaya
                    result.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    left++;
                    right--;

                    // Duplicate left values skip karo
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Duplicate right values skip karo
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {

                    // Sum chhota hai, left ko aage badhao
                    left++;

                } else {

                    // Sum bada hai, right ko peeche lao
                    right--;
                }
            }
        }

        return result;
    }
}
