class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = depth(root, 0);
        return findSum(root, 0, maxDepth);
    }
    
    public int depth(TreeNode root, int depth){
        int maxDepth = depth;
        
        if(root.left != null){maxDepth = depth(root.left, depth + 1);}
        if(root.right != null){maxDepth = Math.max(depth(root.right, depth + 1), maxDepth);}
        
        return maxDepth;
    }
    
    public int findSum(TreeNode root, int currentDepth, int maxDepth){
        int sum = 0;
        
        if(currentDepth == maxDepth){return root.val;}
        
        if(root.right != null){sum += findSum(root.right, currentDepth + 1, maxDepth);}
        if(root.left != null){sum += findSum(root.left, currentDepth + 1, maxDepth);}
        
        return sum;
    }
}