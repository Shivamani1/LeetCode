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
    public boolean isSymmetric(TreeNode root) {
       return bool(root.left,root.right);
        
    }
    boolean bool(TreeNode l,TreeNode r){
        if(l==null && r==null)
            return true;
        if(l==null||r==null)
            return false;
        if(l.val!=r.val)
            return false;
        if(!bool(l.left,r.right))
            return false;
        if(!bool(l.right,r.left))
            return false;
return true;
        
        
   
}}