/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {

        // Step 1: Find middle using slow and fast
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half of linked list
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {

            ListNode nextNode = curr.next; // Next node save karo

            curr.next = prev; // Link reverse karo

            prev = curr; // Prev ko aage badhao
            curr = nextNode; // Curr ko aage badhao
        }

        // Step 3: Compare both halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {

            // Agar values different hain
            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}
