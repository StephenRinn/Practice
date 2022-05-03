
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    /* Overload for recursion   */
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        
        /*  If there are no branches or leaves it must be balanced   */
        if (root == null) {return true;}
        
        /*  Check values against value caps set by branches above    */
        if (root.val >= maxVal || root.val <= minVal){return false;}
        
        /*  Use recursion to find leaves    */
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}