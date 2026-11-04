public class Solution {
    public boolean hasCycle(ListNode head) {

        // Slow pointer ek step chalega
        ListNode slow = head;

        // Fast pointer do steps chalega
        ListNode fast = head;

        // Jab tak fast aur uska next null nahi hai
        while (fast != null && fast.next != null) {

            // Slow ek step aage
            slow = slow.next;

            // Fast do steps aage
            fast = fast.next.next;

            // Agar dono same node par aa gaye
            if (slow == fast) {
                return true;
            }
        }

        // Fast null tak pahunch gaya, cycle nahi hai
        return false;
    }
}