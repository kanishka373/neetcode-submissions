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


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node banaya, starting mein value 0 hai
        ListNode dummy = new ListNode(0);

        // Current pointer result list ko build karega
        ListNode current = dummy;

        // Jab tak dono lists mein nodes available hain
        while (list1 != null && list2 != null) {

            // Agar list1 ki value chhoti ya equal hai
            if (list1.val <= list2.val) {

                // List1 ka node result mein attach karo
                current.next = list1;

                // List1 ko next node par le jao
                list1 = list1.next;

            } else {

                // List2 ka node result mein attach karo
                current.next = list2;

                // List2 ko next node par le jao
                list2 = list2.next;
            }

            // Current ko result ke last node par move karo
            current = current.next;
        }

        // Agar list1 mein nodes bach gaye hain toh attach karo
        if (list1 != null) {
            current.next = list1;
        }

        // Agar list2 mein nodes bach gaye hain toh attach karo
        if (list2 != null) {
            current.next = list2;
        }

        // Dummy ko chhodkar actual merged list return karo
        return dummy.next;
    }
}
