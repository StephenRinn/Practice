/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        boolean found = false;
        Stack<TreeNode> originStack = new Stack<TreeNode>();
        Stack<TreeNode> copyStack = new Stack<TreeNode>();
        TreeNode origin = original;
        TreeNode copy = cloned;
        
        while(!found){
            if(origin.val == target.val){
                return copy;
            }
            if(origin.left != null){
                originStack.push(origin.left);
                copyStack.push(copy.left);
            }
            if(origin.right != null){
                originStack.push(origin.right);
                copyStack.push(copy.right);
            }
            if(originStack.isEmpty()){
                return origin;
            }
            origin = originStack.pop();
            copy = copyStack.pop();
        }
        return original;
    }
}