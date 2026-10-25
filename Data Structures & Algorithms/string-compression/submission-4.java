class Solution {
    public int compress(char[] chars) {

        // write batayega ki answer kis position par likhna hai
        int write = 0;

        // i current group ko traverse karega
        int i = 0;

        while (i < chars.length) {

            // Current character save kar lo
            char current = chars[i];

            // Count karo ki current character kitni baar aaya
            int count = 0;

            // Jab tak same character mil raha hai
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            // Current character answer mein likho
            chars[write] = current;
            write++;

            // Agar character ek se zyada baar aaya
            if (count > 1) {

                // Count ko String mein convert karo
                String countString = String.valueOf(count);

                // Count ke digits answer mein likho
                for (char digit : countString.toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }
        }

        // Compressed array ki length return karo
        return write;
    }
}