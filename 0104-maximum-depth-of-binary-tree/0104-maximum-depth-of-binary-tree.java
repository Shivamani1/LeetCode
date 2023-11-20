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
    
    
    
      int c=0;
    
    
    public int maxDepth(TreeNode root) {
        max(root,0);
        return c;
    }
    
    
    void max(TreeNode root,int n){
        if(root==null){
            c=Math.max(c,n);
            return ;
        }
            max(root.left,n+1);
            max(root.right,n+1);
 
        
    }
    
    
    
}