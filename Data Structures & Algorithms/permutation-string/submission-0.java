
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // Agar s1, s2 se lambi hai, permutation possible nahi
        if (s1.length() > s2.length()) {
            return false;
        }

        // 26 lowercase letters ki frequency store karenge
        int[] count = new int[26];

        // s1 ke characters ke counts increase karo
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        // s2 ki pehli window ke characters ke counts decrease karo
        for (int i = 0; i < s1.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

        // Agar saare counts zero hain, pehli window permutation hai
        if (allZero(count)) {
            return true;
        }

        // Window ko aage slide karo
        for (int right = s1.length(); right < s2.length(); right++) {

            // Window se bahar jaane wale character ka count wapas badhao
            count[s2.charAt(right - s1.length()) - 'a']++;

            // Window mein naye aane wale character ka count ghatao
            count[s2.charAt(right) - 'a']--;

            // Dono frequencies match kar rahi hain?
            if (allZero(count)) {
                return true;
            }
        }

        // Koi matching window nahi mili
        return false;
    }

    private boolean allZero(int[] count) {
        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
