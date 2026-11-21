
class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Current fruit ki frequency increase karo
            map.put(fruits[right],
                map.getOrDefault(fruits[right], 0) + 1);

            // Agar 2 se zyada fruit types hain
            while (map.size() > 2) {

                // Left wala fruit remove karo
                map.put(fruits[left],
                    map.get(fruits[left]) - 1);

                // Agar frequency 0 ho gayi toh map se hata do
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                // Window ko aage badhao
                left++;
            }

            // Maximum window length update karo
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
