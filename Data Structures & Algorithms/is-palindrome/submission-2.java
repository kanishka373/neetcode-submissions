
class Solution {
    public boolean isPalindrome(String s) {
 // Left pointer
        int left = 0;

        // Right pointer
        int right = s.length() - 1;

        // Jab tak dono pointers mil na jaye
        while (left < right) {

            // Agar left side letter ya digit nahi hai
            // To usse skip karo
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Agar right side letter ya digit nahi hai
            // To usse skip karo
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Dono characters compare karo
            else {

                // Dono ko lowercase me convert karke compare karo
                if (Character.toLowerCase(s.charAt(left))
                        != Character.toLowerCase(s.charAt(right))) {

                    return false;
                }

                // Agar same hain to pointers move karo
                left++;
                right--;
            }
        }

        // Agar pura loop chal gaya
        return true;
    }
}