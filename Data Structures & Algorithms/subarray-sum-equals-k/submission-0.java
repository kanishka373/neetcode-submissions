

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Sum 0 pehle ek baar mila hai
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // Check karo required previous prefix sum mila hai?
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Current prefix sum ki frequency update karo
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}