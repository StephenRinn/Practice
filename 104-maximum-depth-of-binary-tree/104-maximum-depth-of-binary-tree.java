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

// Recursion seemed like the fastest solution to this problem
class Solution {
    public int maxDepth(TreeNode root) {
        
        
        // Catch empty input from test ( missed on first submission )
        if(root == null){
            return 0;
        }
        
        
        // Check common use for leaves before adding up through the max function
        if(root.left != null && root.right == null){
            return (maxDepth(root.left) + 1);
        }
        
        if(root.right != null && root.left == null){
            return (maxDepth(root.right) + 1);
        }
        
        if(root.left != null && root.right != null){
            return (Math.max(maxDepth(root.right),maxDepth(root.left)) + 1);
        }
        
        return 1;
    }
}