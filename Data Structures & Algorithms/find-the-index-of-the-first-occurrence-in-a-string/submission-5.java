class Solution {
    public int strStr(String haystack, String needle) {

        // Jitni positions par needle fit ho sakti hai
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            // Needle ke characters compare karo
            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {

                j++;
            }

            // Needle ke saare characters match ho gaye
            if (j == needle.length()) {
                return i;
            }
        }

        // Needle nahi mili
        return -1;
    }
}