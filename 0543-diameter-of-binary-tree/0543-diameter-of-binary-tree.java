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

    int depth(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(depth(root.left),depth(root.right));
    }

    int diameter(TreeNode root){
        if(root==null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.max(left+right,Math.max(diameter(root.left),diameter(root.right))) ;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        
        return diameter(root);
    }
}