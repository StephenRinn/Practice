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

import java.util.HashMap;

class Solution {
    private List<Integer> output = new ArrayList<Integer>();
    private HashMap<Integer,Integer> hold = new HashMap<Integer,Integer>();
    
    
    public List<Integer> largestValues(TreeNode root) {
        levelCheck(0, root);
        
        for(int i = 0; i < hold.size(); i++){
            output.add(hold.get(i));
        }
        
        return output;
    }
    
    private void levelCheck(int level, TreeNode node){
        
        if(node == null){
            return;
        }
        
        if(!hold.containsKey(level)){
            hold.put(level,node.val);
        }else{
            hold.put(level, Math.max(hold.get(level), node.val));
        }
        
        levelCheck(level + 1, node.left);
        levelCheck(level + 1, node.right);
        
        return;
        
    }
}