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
        void inorder(List<Integer> x,TreeNode root){
        if(root==null)
            return;
        inorder(x,root.left);
        x.add(root.val);
        inorder(x,root.right);
        
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
  inorder(l,root);
        return l;
       }

        
        

    }
