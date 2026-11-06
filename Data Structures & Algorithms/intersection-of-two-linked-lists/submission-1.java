/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Pointer a ko List A ke starting node par rakho
        ListNode a = headA;

        // Pointer b ko List B ke starting node par rakho
        ListNode b = headB;

        // Jab tak dono pointers same node par nahi milte, loop chalao
        while (a != b) {

            // Agar pointer a list ke end (null) par pahunch gaya
            if (a == null) {

                // Toh use List B ke starting node par bhej do
                a = headB;

            } else {

                // Otherwise a ko ek node aage move karo
                a = a.next;
            }

            // Agar pointer b list ke end (null) par pahunch gaya
            if (b == null) {

                // Toh use List A ke starting node par bhej do
                b = headA;

            } else {

                // Otherwise b ko ek node aage move karo
                b = b.next;
            }
        }

        // Dono same node par mile toh wahi return karo
        // Agar intersection nahi hai toh dono null honge
        return a;
    }
}