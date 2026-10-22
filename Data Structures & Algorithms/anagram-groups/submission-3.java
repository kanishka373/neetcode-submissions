

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Same frequency wale words ko ek group mein rakhne ke liye
        HashMap<String, List<String>> map = new HashMap<>();

        // Har word ko check karo
        for (String word : strs) {

            // 26 lowercase letters ki frequency
            int[] freq = new int[26];

            // Word ke har character ki frequency count karo
            for (char ch : word.toCharArray()) {

                // 'a' -> 0, 'b' -> 1, ... 'z' -> 25
                freq[ch - 'a']++;
            }

            // Frequency array ko String key bana do
            String key = Arrays.toString(freq);

            // Agar key pehle se hai to uski list lo
            // Agar nahi hai to new ArrayList banao
            map.putIfAbsent(key, new ArrayList<>());

            // Current word ko uske anagram group mein daalo
            map.get(key).add(word);
        }

        // HashMap ki saari groups return karo
        return new ArrayList<>(map.values());
    }
}