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
    public ListNode removeElements(ListNode head, int val) {

        // Step 1: Create a dummy node
        ListNode dummy = new ListNode(0);

        // Step 2: Connect dummy with head
        dummy.next = head;

        // Step 3: Create current pointer
        ListNode curr = dummy;

        // Step 4: Traverse the linked list
        while (curr.next != null) {

            // Check if next node has the target value
            if (curr.next.val == val) {

                // Delete the next node
                curr.next = curr.next.next;

            } else {

                // Move to the next node
                curr = curr.next;
            }
        }

        // Step 5: Return updated head
        return dummy.next;
    }
}
