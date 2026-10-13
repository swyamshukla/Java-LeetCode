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

    static int depth(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(depth(root.left) , depth(root.right));
    }

    static boolean check(TreeNode root){
        if(root==null) return true;
        if(Math.abs(depth(root.left)-depth(root.right)) >1) return false;

        return check(root.left) && check(root.right);

    }

    

    
    public boolean isBalanced(TreeNode root) {
        return check(root);

    }
}