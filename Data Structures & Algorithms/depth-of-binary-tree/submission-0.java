/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {

        // Agar node null hai toh depth 0 hogi
        if (root == null) {
            return 0;
        }

        // Left subtree ki depth find krni h 
        int left = maxDepth(root.left);

        // Right subtree ki depth find kremge
        int right = maxDepth(root.right);

        // Dono mein se maximum depth lekar 1 add karenge after iske
        return 1 + Math.max(left, right);
    }
}