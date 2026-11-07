
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // Minimum possible eating speed
        int low = 1;

        // Maximum pile find karne ke liye
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        // Binary Search
        while (low < high) {

            // Middle speed calculate karo
            int mid = low + (high - low) / 2;

            // Is speed par total kitne hours lagenge
            int hours = 0;

            for (int pile : piles) {

                // Har pile ke hours calculate karo
                // Ceiling division: extra bananas ke liye bhi
                // ek poora hour count hoga
                hours += (pile + mid - 1) / mid;
            }

            // Agar allowed hours mein kaam ho raha hai
            if (hours <= h) {

                // Speed valid hai, aur chhoti speed try karo
                high = mid;

            } else {

                // Speed slow hai, speed badhani padegi
                low = mid + 1;
            }
        }

        // Minimum valid speed
        return low;
    }
}
