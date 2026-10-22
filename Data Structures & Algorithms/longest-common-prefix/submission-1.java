class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Pehli string ko starting prefix maan lo
        String prefix = strs[0];

        // Baaki saari strings ke saath compare karo
        for (int i = 1; i < strs.length; i++) {

            // Jab tak current string prefix se start nahi hoti
            while (!strs[i].startsWith(prefix)) {

                // Prefix ka last character hata do
                prefix = prefix.substring(0, prefix.length() - 1);

                // Agar prefix empty ho gaya
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Jo common prefix bacha hai wahi answer hai
        return prefix;
    }
}