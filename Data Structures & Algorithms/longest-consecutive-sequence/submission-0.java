
class Solution {
    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Array ke saare elements HashSet mein daalo
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Har number ko check karo
        for (int num : set) {

            // Step 3: Sirf sequence ke starting number se counting karo
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 4: Consecutive numbers check karo
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 5: Maximum length update karo
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
    }
}