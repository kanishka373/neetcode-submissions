
class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Traverse both strings
        while (i < s.length() && j < t.length()) {

            // If characters match
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move both pointers
            }

            j++; // Always move j
        }

        // Check whether all characters of s matched
        return i == s.length();
    }
}
