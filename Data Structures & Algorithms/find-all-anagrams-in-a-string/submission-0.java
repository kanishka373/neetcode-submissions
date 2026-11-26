class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // P ke characters ki frequency count krni hai
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            // Current character window mein add krna hai
            sCount[s.charAt(i) - 'a']++;

            // Window size k se badi ho gayi toh
            // purana character remove krna hai
            if (i >= k) {
                sCount[s.charAt(i - k) - 'a']--;
            }

            // Dono frequency arrays compare karo
            if (Arrays.equals(pCount, sCount)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}
