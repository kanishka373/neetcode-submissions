class Solution {
    public void reverseString(char[] s) {
 // Left pointer
        int left = 0;

        // Right pointer
        int right = s.length - 1;

        // Jab tak left aur right mil na jaye
        while (left < right) {

            // Characters swap karo
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Pointers move karo
            left++;
            right--;
        }
    }
}